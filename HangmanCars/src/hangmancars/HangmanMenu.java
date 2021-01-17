/*
 * Hangman Game by Shahob Kazemi and Ariadne Marangozis
 * ISU
 * Mr. Mah
 * ICS 4U1
 */
package hangmancars;

import static hangmancars.HangmanAnimals.startAnimals;
import static hangmancars.HangmanCountries.startCountries;
import static hangmancars.HangmanCarsGame.startCars;
import static hangmancars.HangmanDictionary.startDictionary;
import static hangmancars.HangmanHeroes.startHeroes;
import static hangmancars.HangmanTwoPlayer.startTwoPlayer;
import static hangmancars.HangmanVideoGame.startGames;
import java.awt.Component;
import javax.swing.JOptionPane;

public class HangmanMenu extends javax.swing.JFrame {


    /**
     * Creates new form HangmanMenu
     */
    public HangmanMenu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        superheroButton = new javax.swing.JButton();
        carsButton = new javax.swing.JButton();
        superheroLabel = new javax.swing.JLabel();
        carLabel = new javax.swing.JLabel();
        dictionaryButton = new javax.swing.JButton();
        englishLabel = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        videoGameLabel = new javax.swing.JLabel();
        videoGameButton = new javax.swing.JButton();
        panel1 = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        countryLabel = new javax.swing.JLabel();
        countryButton = new javax.swing.JButton();
        warningLabel = new javax.swing.JLabel();
        animalsButton = new javax.swing.JButton();
        animalLabel = new javax.swing.JLabel();
        twoPlayerButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        aimodesLabel = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(51, 0, 255));
        jPanel3.setForeground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 48)); // NOI18N
        titleLabel.setText("Ultimate Hangman");

        superheroButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmancars/superheroes.jpg"))); // NOI18N
        superheroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                superheroButtonActionPerformed(evt);
            }
        });

        carsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmancars/cars.jpg"))); // NOI18N
        carsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carsButtonActionPerformed(evt);
            }
        });

        superheroLabel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        superheroLabel.setText("Guess that superhero");

        carLabel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        carLabel.setText("Guess that car brand");

        dictionaryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmancars/dictonary.png"))); // NOI18N
        dictionaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dictionaryButtonActionPerformed(evt);
            }
        });

        englishLabel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        englishLabel.setText("Do you even english?");

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        videoGameLabel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        videoGameLabel.setText("Guess that Video game");

        videoGameButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmancars/game.jpg"))); // NOI18N
        videoGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                videoGameButtonActionPerformed(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(153, 0, 153));
        panel1.setForeground(new java.awt.Color(153, 0, 153));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        panel2.setBackground(new java.awt.Color(153, 0, 153));
        panel2.setForeground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        countryLabel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        countryLabel.setText("Guess that Country");

        countryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hangman Button images/canada.jpg"))); // NOI18N
        countryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryButtonActionPerformed(evt);
            }
        });

        warningLabel.setText("WARNING: This game works best using 1080p monitors");

        animalsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hangman Button images/animals.jpg"))); // NOI18N
        animalsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                animalsButtonActionPerformed(evt);
            }
        });

        animalLabel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        animalLabel.setText("Guess that Animal");

        twoPlayerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangmancars/twoplayer.jpg"))); // NOI18N
        twoPlayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoPlayerButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("Two Player Mode");

        aimodesLabel.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        aimodesLabel.setForeground(new java.awt.Color(153, 0, 153));
        aimodesLabel.setText("AI Modes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(twoPlayerButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(videoGameButton)
                                .addComponent(videoGameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(animalsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(animalLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(72, 72, 72)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(countryButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(countryLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(81, 81, 81))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(557, 557, 557)
                                    .addComponent(exitButton))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(superheroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(superheroButton))
                                    .addGap(46, 46, 46)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(carsButton)
                                        .addComponent(carLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(47, 47, 47)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dictionaryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(englishLabel))))
                            .addGap(45, 45, 45)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(warningLabel)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(aimodesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(254, 254, 254))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(224, 224, 224))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(warningLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleLabel)
                .addGap(48, 48, 48)
                .addComponent(aimodesLabel)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carLabel)
                    .addComponent(superheroLabel)
                    .addComponent(englishLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(superheroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dictionaryButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(animalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(videoGameLabel)
                            .addComponent(countryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(twoPlayerButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(animalsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(countryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(videoGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addGap(10, 10, 10)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void superheroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_superheroButtonActionPerformed
       JOptionPane.showMessageDialog(null, "Instructions: Guess the correct superhero."); // Displays the instructions for the game.
       JOptionPane.showMessageDialog(null, "NOTE: Dashes ('-') are spaces in this game. Not all words contain spaces, but some do. You are in charge of figuring out where those spaces are by inputing them yourself. GOOD LUCK!"); // Displays this note after instructions, about the spaces.
       startHeroes(); System.exit(0); // "sends the program to HangmanHeroes.java"
       this.setVisible(false);
    }//GEN-LAST:event_superheroButtonActionPerformed

    private void carsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carsButtonActionPerformed
       JOptionPane.showMessageDialog(null, "Instructions: Guess the correct car brand."); // Displays the instructions for the game.
       JOptionPane.showMessageDialog(null, "NOTE: Dashes ('-') are spaces in this game. Not all words contain spaces, but some do. You are in charge of figuring out where those spaces are by inputing them yourself. GOOD LUCK!"); // Displays this note after instructions, about the spaces.
       startCars(); System.exit(0); // "sends the program to HangmanCars.java"
       this.setVisible(false);
    }//GEN-LAST:event_carsButtonActionPerformed

    private void dictionaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dictionaryButtonActionPerformed
       JOptionPane.showMessageDialog(null, "Instructions: Guess the correct word from the dictionary."); // Displays the instructions for the game.
       startDictionary(); System.exit(0); // "sends the program to HangmanDictionary.java"
       this.setVisible(false);
    }//GEN-LAST:event_dictionaryButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void videoGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_videoGameButtonActionPerformed
        JOptionPane.showMessageDialog(null, "Instructions: Guess the correct video game."); // Displays the instructions for the game.
        JOptionPane.showMessageDialog(null, "NOTE: Dashes ('-') are spaces in this game. Not all words contain spaces, but some do. You are in charge of figuring out where those spaces are by inputing them yourself. GOOD LUCK!"); // Displays this note after instructions, about the spaces.
        startGames(); System.exit(0); // "sends the program to HangmanVideoGame.java"
       this.setVisible(false);
    }//GEN-LAST:event_videoGameButtonActionPerformed

    private void countryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryButtonActionPerformed
       JOptionPane.showMessageDialog(null, "Instructions: Guess the correct country."); // Displays the instructions for the game.
        JOptionPane.showMessageDialog(null, "NOTE: Dashes ('-') are spaces in this game. Not all words contain spaces, but some do. You are in charge of figuring out where those spaces are by inputing them yourself. GOOD LUCK!"); // Displays this note after instructions, about the spaces.
       startCountries(); System.exit(0); // "sends the program to HangmanCountries.java"
       this.setVisible(false);
       
    }//GEN-LAST:event_countryButtonActionPerformed

    private void animalsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_animalsButtonActionPerformed
        JOptionPane.showMessageDialog(null, "Instructions: Guess the correct animal."); // Displays the instructions for the game.
        JOptionPane.showMessageDialog(null, "NOTE: Dashes ('-') are spaces in this game. Not all words contain spaces, but some do. You are in charge of figuring out where those spaces are by inputing them yourself. GOOD LUCK!"); // Displays this note after instructions, about the spaces.
       startAnimals(); System.exit(0); // "sends the program to HangmanAnimals.java"
       this.setVisible(false);
    }//GEN-LAST:event_animalsButtonActionPerformed

    private void twoPlayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoPlayerButtonActionPerformed
        JOptionPane.showMessageDialog(null, "Instructions: 2 players take turns choosing/guessing the word."); //displays popup box with instructions
        JOptionPane.showMessageDialog(null, "NOTE: Make sure the word(s) you type are not more than 18 characters. If you want to add a space to your word, use a dash ('-') to indicate the space.");//displays popup box with crucial note
        JOptionPane.showMessageDialog(null, "NOTE: Dashes ('-') are spaces in this game. Not all words contain spaces, but some do. You (GUESSER) are in charge of figuring out where those spaces are by inputing them yourself. GOOD LUCK!");//displays popup box with crucial note
        startTwoPlayer(); //accesses and starts two player version
        this.setVisible(false); //makes menu disappear
    }//GEN-LAST:event_twoPlayerButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HangmanMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HangmanMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HangmanMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HangmanMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HangmanMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aimodesLabel;
    private javax.swing.JLabel animalLabel;
    private javax.swing.JButton animalsButton;
    private javax.swing.JLabel carLabel;
    private javax.swing.JButton carsButton;
    private javax.swing.JButton countryButton;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JButton dictionaryButton;
    private javax.swing.JLabel englishLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JButton superheroButton;
    private javax.swing.JLabel superheroLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton twoPlayerButton;
    private javax.swing.JButton videoGameButton;
    private javax.swing.JLabel videoGameLabel;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
}
