
package hangmancars;

import java.util.HashMap;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;


                /*REFER TO "HangmanCountries.java" for comments*/



public class HangmanVideoGame extends Application {
    
    private static final int appW = 1700;
    private static final int appH = 600;
    private static final Font defaultFont = new Font("Times New Roman", 36);

    private static final int pointsPerLetter = 20;
    private static final float bonusMod = 0.4f;
    
    private SimpleStringProperty word = new SimpleStringProperty();
    
    private SimpleIntegerProperty lettersToGuess = new SimpleIntegerProperty();
    
    private SimpleIntegerProperty score = new SimpleIntegerProperty();
    
    private float scoreMod = 1.0f;
    
    private SimpleBooleanProperty playable = new SimpleBooleanProperty();
    
    private ObservableList<Node> letters;
    
    private HashMap<Character, Text> alphabet = new HashMap<Character, Text>();
    
    private HangmanImage hangman = new HangmanImage();

    private WordReaderGames wordReader = new WordReaderGames();
    
    public Parent createContent(){
        
        HBox rowLetters = new HBox();
        rowLetters.setAlignment(Pos.CENTER);
        letters = rowLetters.getChildren();
        
        playable.bind(hangman.lives.greaterThan(0).and(lettersToGuess.greaterThan(0)));
        playable.addListener((obs, old, newValue) -> {
            if (!newValue.booleanValue())
                stopGame();
});
        
        Button btnAgain = new Button("NEW GAME");
        btnAgain.disableProperty().bind(playable);
        btnAgain.setOnAction(event -> startGame());
        
        Button btnExit = new Button("EXIT");
        btnExit.setOnAction(event -> exitGame());
        
        HBox row1 = new HBox();
        HBox row3 = new HBox();
        row1.setAlignment(Pos.CENTER);
        row3.setAlignment(Pos.CENTER);
        for (int i = 0 ; i < 20; i++) {
        row1.getChildren().add(new Letter(' '));
        row3.getChildren().add(new Letter(' '));
        
        } 
        
        HBox rowAlphabet = new HBox(5);
        rowAlphabet.setAlignment(Pos.CENTER);
        for (char c = 'A'; c <= 'Z'; c++) {
            Text t = new Text(String.valueOf(c));
            t.setFont(defaultFont);
            alphabet.put(c, t);
            rowAlphabet.getChildren().add(t);
        
        }
        
        Text hyphen = new Text("-");
        hyphen.setFont(defaultFont);
        alphabet.put('-', hyphen);
        rowAlphabet.getChildren().add(hyphen);

        Text textScore = new Text();
        textScore.textProperty().bind(score.asString().concat(" Points"));

        HBox rowHangman = new HBox(10, btnAgain, btnExit, textScore, hangman);
        rowHangman.setAlignment(Pos.CENTER);

        VBox vBox = new VBox(10);
        // vertical layout
        vBox.getChildren().addAll(
                row1,
                rowLetters,
                row3,
                rowAlphabet,
                rowHangman);
        return vBox;
}
    private void stopGame(){
        
        for (Node n : letters) {
        Letter letter = (Letter) n;
        letter.show();
    
        
        
    } 
    } private void startGame() {
        
        for (Text t : alphabet.values()){
            t.setStrikethrough(false);
            t.setFill(Color.BLACK);
            
            
        }
        
        hangman.reset();
        word.set(wordReader.getRandomWord().toUpperCase());
        lettersToGuess.set(word.length().get());        
        
        letters.clear();
        for (char c : word.get().toCharArray()){
            letters.add(new Letter(c));
            
            
        }
        
        
    } private static class HangmanImage extends Parent{
        
        private static final int spineStartA = 10;
        private static final int spineStartB = 20;
        private static final int spineEndA = spineStartA;
        private static final int spineEndB = spineStartB + 50;
        
        private SimpleIntegerProperty lives = new SimpleIntegerProperty();
        
        
        public HangmanImage(){
            
            Circle head = new Circle(20);
            head.setTranslateX(spineStartA);

            Line spine = new Line();
            spine.setStartX(spineStartA);
            spine.setStartY(spineStartB);
            spine.setEndX(spineEndA);
            spine.setEndY(spineEndB);

            Line leftArm = new Line();
            leftArm.setStartX(spineStartA);
            leftArm.setStartY(spineStartB);
            leftArm.setEndX(spineStartA + 40);
            leftArm.setEndY(spineStartB + 10);

            Line rightArm = new Line();
            rightArm.setStartX(spineStartA);
            rightArm.setStartY(spineStartB);
            rightArm.setEndX(spineStartA - 40);
            rightArm.setEndY(spineStartB + 10);

            Line leftLeg = new Line();
            leftLeg.setStartX(spineEndA);
            leftLeg.setStartY(spineEndB);
            leftLeg.setEndX(spineEndA + 25);
            leftLeg.setEndY(spineEndB + 50);

            Line rightLeg = new Line();
            rightLeg.setStartX(spineEndA);
            rightLeg.setStartY(spineEndB);
            rightLeg.setEndX(spineEndA - 25);
            rightLeg.setEndY(spineEndB + 50);

            getChildren().addAll(head, spine, leftArm, rightArm, leftLeg, rightLeg);
            lives.set(getChildren().size());
            
        }  public void reset() {
            
             getChildren().forEach(node -> node.setVisible(false));
             lives.set(getChildren().size());
            
        } public void takeAwayLife() {
            for (Node n : getChildren()){
               if (!n.isVisible()) {
                   n.setVisible(true);
                    lives.set(lives.get() - 1);
                    break;  
                   
                   
                   
               }  
                  
            }
             
        }  
    } private static class Letter extends StackPane {
         private Circle bg = new Circle(40);
         private Text text;
        
         public Letter(char letter){
            bg.setFill(letter == ' ' ? Color.BROWN : Color.WHITE);
            bg.setStroke(Color.BLACK);

            text = new Text(String.valueOf(letter).toUpperCase());
            text.setFont(defaultFont);
            text.setVisible(false);

            setAlignment(Pos.CENTER);
            getChildren().addAll(bg, text);
             
             
             
             
         } public void show() {
            RotateTransition rt = new RotateTransition(Duration.seconds(1), bg);
            rt.setAxis(Rotate.Y_AXIS);
            rt.setToAngle(180);
            rt.setOnFinished(event -> text.setVisible(true));
            rt.play();
             
             
             
         } public boolean isEqualTo(char other) {
             
             return text.getText().equals(String.valueOf(other).toUpperCase());
                
         }
           
    }
    
     @Override
     public void start(Stage primaryStage) throws Exception {
         
         Scene scene = new Scene(createContent());
         
          scene.setOnKeyPressed((KeyEvent event) -> {
              if (event.getText().isEmpty())
                return;
              
              char pressed = event.getText().toUpperCase().charAt(0);
            if ((pressed < 'A' || pressed > 'Z') && pressed != '-')
            return;
            
            
            if (playable.get()){
                Text t = alphabet.get(pressed);
                if (t.isStrikethrough())
                return;
                
                t.setFill(Color.BLUE);
                t.setStrikethrough(true);

                boolean found = false;
                
                
                for (Node n : letters){
                    Letter letter = (Letter) n;
                    if (letter.isEqualTo(pressed)){
                        found = true;
                        score.set(score.get() + (int)(scoreMod * pointsPerLetter));
                        lettersToGuess.set(lettersToGuess.get() - 1);
                        letter.show(); 
                        
                        
                        
                        
                    }
                    
                    
                }  if (!found) {
                    
                    hangman.takeAwayLife();
                    scoreMod = 1.0f; 
                    
                } else {
                    scoreMod += bonusMod;
                }
            }
});
        primaryStage.setResizable(false);
        primaryStage.setWidth(appW);
        primaryStage.setHeight(appH);
        primaryStage.setTitle("Hangman");
        primaryStage.setScene(scene);
        primaryStage.show();
        startGame();  
                
                
                
                
                
            } private void exitGame(){
                
               System.exit(0); 
                
            }
     
     
          public static void main(String[] args) {
                
                 
            launch(args); 
            
          } public static void startGames(){
              launch(); 
          }  
         
     } 
    
    
    
    
    
    
    