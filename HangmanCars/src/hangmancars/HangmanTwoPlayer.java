/*
 * Hangman Game by Shahob Kazemi and Ariadne Marangozis
 * ISU
 * Mr. Mah
 * ICS 4U1
 */
package hangmancars;

import java.util.HashMap;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;


public class HangmanTwoPlayer extends Application {
    /* The following variables are declared here using "private" so that they can be accessed
       throughout the entire program by all the methods in the class
    */
    
    //The "final" means that the variable will never change (they are constants)
    private static final int appW = 1700; //width of window
    private static final int appH = 600; //height of window
    private static final Font defaultFont = new Font("Times New Roman", 36); //font
    private static final int pointsPerLetter = 20; 
    private static final float bonus = 0.4f; //amount by which the bonus will increase
    
    private SimpleStringProperty wordToGuess = new SimpleStringProperty(); //word that will need to be guessed
    
    private SimpleIntegerProperty letterNum = new SimpleIntegerProperty(); //remaining letters
    
    private SimpleIntegerProperty score = new SimpleIntegerProperty(); //score
    
    private float scoreMod = 1.0f; //# of points next correct guess will be worth (modifier)
    
    private SimpleBooleanProperty playable = new SimpleBooleanProperty(); //determines if game is playable
    
    private ObservableList<Node> letters; //list that allows "listeners" to track changes made
    
    private HashMap<Character, Text> alphabet = new HashMap<Character, Text>(); //Will play role in alphabet display
    
    private HangmanImage hangman = new HangmanImage(); //creates new object "hangman", associated with the hangman image
 
    /* Note: "SimpleStringProperty", "SimpleIntegerProperty" and "SimpleBooleanProperty" are used instead
       of "String", "int", and "boolean" because they allow the variables to be bound and observed later on.
    */
    
    TextField input = new TextField(); //creates input box
    Label instructions = new Label(); //creates label for instructions
     
    public Parent createContent(){ //superclass that will create the GUI
        //Below code creates the row of circles on the GUI that will display the word
        HBox rowLetters = new HBox();
        rowLetters.setAlignment(Pos.CENTER);
        letters = rowLetters.getChildren();
        
        playable.bind(hangman.lives.greaterThan(0).and(letterNum.greaterThan(0))); //binds requirements (# of lives must be > 0, and letters to guess must be > 0) to the "playable" boolean value
        //the below code checks if the "playable" boolean has a new value. If there is no new value, the game is stopped.
        playable.addListener((obs, old, newValue) -> {
            if (!newValue.booleanValue())
                stopGame();
        });
        
        Button begin = new Button ("Begin"); //creates "begin" button
        begin.disableProperty().bind(playable); //will disable button until game is won or lost
        begin.setOnAction(event -> hide()); //when button is pressed, the "hide" method is called
        
        Button btnExit = new Button("EXIT");
        btnExit.setOnAction(event -> exitGame());
        
        //Below code creates and arranges two rows of blank red circles on GUI for aesthetic purposes
        HBox row1 = new HBox();
        HBox row3 = new HBox();
        row1.setAlignment(Pos.CENTER);
        row3.setAlignment(Pos.CENTER);
        for (int i = 0 ; i < 20; i++) { //makes circles empty (not containing any text/letters other than a blank)
        row1.getChildren().add(new Letter(' '));
        row3.getChildren().add(new Letter(' '));
        
        } 
        //Below code creates the alphabet display and arranges it
        HBox rowAlphabet = new HBox(5);
        rowAlphabet.setAlignment(Pos.CENTER);
        for (char c = 'A'; c <= 'Z'; c++) {
            Text t = new Text(String.valueOf(c)); 
            /*note: t is the visual text in the GUI,while c is the corresponding character
             that the program actually reads
            */
            t.setFont(defaultFont); //applies default font
            alphabet.put(c, t); //associates visual text with character
            rowAlphabet.getChildren().add(t); //adds text to the row
        }
        //Below code adds a hyphen in addition to the rest of the alphabet
        Text hyphen = new Text("-");
        hyphen.setFont(defaultFont);
        alphabet.put('-', hyphen);
        rowAlphabet.getChildren().add(hyphen);
        
        //Below code makes a new text object to display the # of points earned
        Text textScore = new Text();
        textScore.textProperty().bind(score.asString().concat(" Points"));
        
        /*
        Below code arranges all the GUI elements that will be below the alphabet display and centers them
        (new game button, score, and hangman image)
        */
        HBox rowHangman = new HBox(10, instructions, input, begin, btnExit, textScore, hangman); //"10" creates gaps between the elements
        rowHangman.setAlignment(Pos.CENTER);
        
        //Below code takes each row of GUI elements and organizes them in the desired vertical order
        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(
                row1,
                rowLetters,
                row3,
                rowAlphabet,
                rowHangman);
        return vBox;
}
    private void stopGame(){
        //When the game is lost, this code is used to reveal the letters that were not guessed to provide users the answer
        for (Node n : letters) {
        Letter letter = (Letter) n;
        letter.show();
        
        input.setVisible(true); //input box reappears
        instructions.setText("Word-choosing player, enter a new word: "); //Changes instruction label to give new instructions  
    }   
    } 
    
    private void hide() {
        input.setVisible(false); //hides input box so that the answer is hidden
        instructions.setText("Guessing player, guess the word!"); //Changes instruction label to give new instructions
        startGame(); //calls startGame method
    }
    
    
    private void startGame() {
        //Below code resets the letters so that they are not crossed out and are black in colour
        for (Text t : alphabet.values()){
            t.setStrikethrough(false);
            t.setFill(Color.BLACK);
        }
        
        hangman.reset(); //resets hangman object (that includes the actual image, # of lives, etc.)
        wordToGuess.set(input.getText().toUpperCase()); //the word is retrieved from the input box and put into uppercase
        letterNum.set(wordToGuess.length().get()); //# of letters left to guess is set to the length of the word since none have been guessed yet
        System.out.println(letterNum);
        letters.clear(); //clears the row of circles that hold the word
        //below code uses a 'for each' loop to add the proper amount of blank circles to GUI (each circle will hold a letter from the word)
        for (char c : wordToGuess.get().toCharArray()){ //this line takes the word (a string) and turns it into a character array
            letters.add(new Letter(c));
        }
    } private void exitGame(){
        System.exit(0);
    } 
    
    private static class HangmanImage extends Parent{
        /*Below code creates the hangman image by setting the sizes of all the lines (legs and arms).
          These integers are all constants.
        */
        private static final int spineStartA = 10;
        private static final int spineStartB = 20;
        private static final int spineEndA = spineStartA;
        private static final int spineEndB = spineStartB + 50;
        
        private SimpleIntegerProperty lives = new SimpleIntegerProperty(); //lives is an integer

        public HangmanImage(){
            
            Circle head = new Circle(20); //creates head
            head.setTranslateX(spineStartA);//adds the head
            
            //Below code arranges and positions the spine
            Line spine = new Line();
            spine.setStartX(spineStartA);
            spine.setStartY(spineStartB);
            spine.setEndX(spineEndA);
            spine.setEndY(spineEndB);
            
            //Below code arranges and positions the left arm
            Line leftArm = new Line();
            leftArm.setStartX(spineStartA);
            leftArm.setStartY(spineStartB);
            leftArm.setEndX(spineStartA + 40);
            leftArm.setEndY(spineStartB + 10);
            
            //Below code arranges and positions the right arm
            Line rightArm = new Line();
            rightArm.setStartX(spineStartA);
            rightArm.setStartY(spineStartB);
            rightArm.setEndX(spineStartA - 40);
            rightArm.setEndY(spineStartB + 10);
            
            //Below code arranges and positions the left leg
            Line leftLeg = new Line();
            leftLeg.setStartX(spineEndA);
            leftLeg.setStartY(spineEndB);
            leftLeg.setEndX(spineEndA + 25);
            leftLeg.setEndY(spineEndB + 50);
            
            //Below code arranges and positions the right leg
            Line rightLeg = new Line();
            rightLeg.setStartX(spineEndA);
            rightLeg.setStartY(spineEndB);
            rightLeg.setEndX(spineEndA - 25);
            rightLeg.setEndY(spineEndB + 50);
            
            getChildren().addAll(head, spine, leftArm, rightArm, leftLeg, rightLeg); //Associates all hangman parts together
            lives.set(getChildren().size()); //# of lives is set to equal the # of hangman body parts
        }  
        
        public void reset() {
             //Below code hides all the hangman parts and resets the # of lives
             getChildren().forEach(node -> node.setVisible(false));
             lives.set(getChildren().size());
        } 
        
        public void takeAwayLife() {
            //Below code makes a body part appear when a letter is guessed incorrectly
            for (Node n : getChildren()){
               if (!n.isVisible()) {
                   n.setVisible(true);
                    lives.set(lives.get() - 1); //one life is taken away
                    break; 
               }  
            } 
        }  
    } 
    
    private static class Letter extends StackPane { //StackPane is used so that GUI elements can be stacked on top of each other when needed
         //Creates the circle design for the circles that will hold the word's letters
         private Circle bg = new Circle(40);
         private Text text;
        
         public Letter(char letter){
             //below code gives circles a white fill with orange outline
            bg.setFill(letter == ' ' ? Color.PURPLE : Color.WHITE);
            bg.setStroke(Color.BLACK);
            
            //below code formats how each letter will look in the circles
            text = new Text(String.valueOf(letter).toUpperCase());
            text.setFont(defaultFont);
            text.setVisible(false);
            
            setAlignment(Pos.CENTER); //centers the circles
            getChildren().addAll(bg, text); //associates circles with text (letters)
         } 
         
         public void show() {
            //Below code creates the animation that plays when the word is revealed
            RotateTransition rt = new RotateTransition(Duration.seconds(1), bg);
            rt.setAxis(Rotate.Y_AXIS);
            rt.setToAngle(180);
            rt.setOnFinished(event -> text.setVisible(true)); //letter will only show when animation is finished
            rt.play();

         } 
         
         public boolean isEqualTo(char other) {
             //this method will be used to check if the entered letter matches a letter in the word
             return text.getText().equals(String.valueOf(other).toUpperCase());
         }
    }
     @Override
     public void start(Stage primaryStage) throws Exception {
         
         Scene scene = new Scene(createContent()); //resets the GUI
         
          scene.setOnKeyPressed((KeyEvent event) -> { //when the user presses the key
              //the following code basically checks to make sure all requirements are met
              if (event.getText().isEmpty()) //if the text is empty (not desired)
                return;
              char pressed = event.getText().toUpperCase().charAt(0);
            if ((pressed < 'A' || pressed > 'Z') && pressed != '-') //if the char. entered is not a-z or a dash (not desired)
            return;
            
            if (playable.get()){ //if the game is playable
                Text t = alphabet.get(pressed); //pressed key is retrieved as input
                if (t.isStrikethrough()) //checks if character has already been guessed
                return;
                
                //Below code crosses out the letter just guessed (if it has not been guessed already)
                t.setFill(Color.BLUE); 
                t.setStrikethrough(true);
                
                boolean found = false; //keeps track of whether letter has been guessed correctly or not
                
                //Below code will check if letter guessed is correct
                for (Node n : letters){
                    Letter letter = (Letter) n;
                    if (letter.isEqualTo(pressed)){
                        found = true; //letter has been found
                        score.set(score.get() + (int)(scoreMod * pointsPerLetter)); //adds proper # of points to score
                        letterNum.set(letterNum.get() - 1); //one less letter to guess
                        letter.show(); //shows the letter using the animation method 
                    }
                }   
                if (!found) { //if the letter is not found
                    
                    hangman.takeAwayLife(); //life is subtracted
                    scoreMod = 1.0f; //score modifier goes back to 1
                    
                } else { //letter is found
                    scoreMod += bonus; //bonus is added to modifier
                }
            }
});
        //Below code formats GUI window, then starts the game
        primaryStage.setResizable(false);
        primaryStage.setWidth(appW);
        primaryStage.setHeight(appH);
        primaryStage.setTitle("Hangman");
        primaryStage.setScene(scene);
        primaryStage.show();
        startGame();  
                
                
          } 
     
     public static void startTwoPlayer(){ //enables two player version to be started from menu
              launch(); 
          }  
     } 
