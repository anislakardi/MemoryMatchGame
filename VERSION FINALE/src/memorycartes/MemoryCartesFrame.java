/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package memorycartes;
import java.awt.Color;
import java.awt.Component;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class MemoryCartesFrame extends javax.swing.JFrame {

    /**
     * Creates new form MemoryCartesFrame
     */
    String[] tableDeCouleur = {"red", "red", "green", "green", "blue", "blue", "orange", "orange", "yellow", "yellow", "pink", "pink", "cyan", "cyan", "magenta", "magenta", "gray", "gray", "white", "white", "black", "black", "lightGray", "lightGray"};
    JButton[] cartes18;
    JButton[] cartes12;
    JButton[] cartes8;
    JButton[] comp;
    int score = 0;
    int i = 0;
    int index;
    String clr ="";
    public MemoryCartesFrame() {
        initComponents();
        cartes18 = new JButton[]{carte1, carte2, carte3, carte4, carte5, carte6, carte7, carte8, carte9, carte10, carte11, carte12,carte13, carte14, carte15, carte16, carte17, carte18};
        cartes12 = new JButton[]{carte2, carte3, carte4, carte5, carte8, carte9, carte10, carte11, carte14, carte15, carte16, carte17};
        cartes8 = new JButton[]{carte2, carte3, carte4, carte5, carte8, carte9, carte10, carte11};
        
        comp = new JButton[2];
        Fonctions.setAllButtonsVisible(cartes18,false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        carte1 = new javax.swing.JButton();
        carte2 = new javax.swing.JButton();
        carte3 = new javax.swing.JButton();
        carte4 = new javax.swing.JButton();
        carte5 = new javax.swing.JButton();
        carte6 = new javax.swing.JButton();
        carte7 = new javax.swing.JButton();
        carte8 = new javax.swing.JButton();
        carte9 = new javax.swing.JButton();
        carte10 = new javax.swing.JButton();
        carte11 = new javax.swing.JButton();
        carte12 = new javax.swing.JButton();
        carte13 = new javax.swing.JButton();
        carte14 = new javax.swing.JButton();
        carte15 = new javax.swing.JButton();
        carte16 = new javax.swing.JButton();
        carte17 = new javax.swing.JButton();
        carte18 = new javax.swing.JButton();
        difficulte = new javax.swing.JComboBox<>();
        bRejouer = new javax.swing.JButton();
        LScore = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new java.awt.GridLayout(3, 6, 2, 2));

        carte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carte1ActionPerformed(evt);
            }
        });
        jPanel1.add(carte1);

        carte2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carte2ActionPerformed(evt);
            }
        });
        jPanel1.add(carte2);

        carte3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carte3ActionPerformed(evt);
            }
        });
        jPanel1.add(carte3);

        carte4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carte4ActionPerformed(evt);
            }
        });
        jPanel1.add(carte4);

        carte5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carte5ActionPerformed(evt);
            }
        });
        jPanel1.add(carte5);

        carte6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carte6ActionPerformed(evt);
            }
        });
        jPanel1.add(carte6);

        carte7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carte7ActionPerformed(evt);
            }
        });
        jPanel1.add(carte7);

        carte8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carte8ActionPerformed(evt);
            }
        });
        jPanel1.add(carte8);

        carte9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carte9ActionPerformed(evt);
            }
        });
        jPanel1.add(carte9);

        carte10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carte10ActionPerformed(evt);
            }
        });
        jPanel1.add(carte10);

        carte11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carte11ActionPerformed(evt);
            }
        });
        jPanel1.add(carte11);

        carte12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carte12ActionPerformed(evt);
            }
        });
        jPanel1.add(carte12);

        carte13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carte13ActionPerformed(evt);
            }
        });
        jPanel1.add(carte13);

        carte14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carte14ActionPerformed(evt);
            }
        });
        jPanel1.add(carte14);

        carte15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carte15ActionPerformed(evt);
            }
        });
        jPanel1.add(carte15);

        carte16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carte16ActionPerformed(evt);
            }
        });
        jPanel1.add(carte16);

        carte17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carte17ActionPerformed(evt);
            }
        });
        jPanel1.add(carte17);

        carte18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carte18ActionPerformed(evt);
            }
        });
        jPanel1.add(carte18);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 600, 360));

        difficulte.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        difficulte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choisissez la difficulté", "Facile", "Moyen", "Difficile" }));
        difficulte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                difficulteActionPerformed(evt);
            }
        });
        getContentPane().add(difficulte, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 190, 40));

        bRejouer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bRejouer.setText("Rejouer");
        bRejouer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRejouerActionPerformed(evt);
            }
        });
        getContentPane().add(bRejouer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 140, 40));

        LScore.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LScore.setText("Le Coups: ");
        getContentPane().add(LScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 115, 41));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bRejouerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRejouerActionPerformed
        // TODO add your handling code here:
        cartes18 = Fonctions.shuffleButtons(cartes18);enableAllButtons(cartes18);
        cartes12 = Fonctions.shuffleButtons(cartes12);enableAllButtons(cartes12);
        cartes8 = Fonctions.shuffleButtons(cartes8);enableAllButtons(cartes8);
        score = 0;
        LScore.setText(String.valueOf(score));
    }//GEN-LAST:event_bRejouerActionPerformed

    private void difficulteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_difficulteActionPerformed
        // TODO add your handling code here:
        score = 0;
        i=0;
        String choix = (String)difficulte.getSelectedItem();
        LScore.setText(String.valueOf(score));
        switch(choix){
            case "Choisissez la difficulté":     Fonctions.setAllButtonsVisible(cartes12,false);    break;
            case "Facile":    Fonctions.setAllButtonsVisible(cartes18,false);Fonctions.setAllButtonsVisible(cartes8,true);cartes8 = Fonctions.shuffleButtons(cartes8);enableAllButtons(cartes8);      break;
            case "Moyen":     Fonctions.setAllButtonsVisible(cartes18,false);Fonctions.setAllButtonsVisible(cartes12,true);cartes12 = Fonctions.shuffleButtons(cartes12);enableAllButtons(cartes12);   break;
            case "Difficile": Fonctions.setAllButtonsVisible(cartes18,true);cartes18 = Fonctions.shuffleButtons(cartes18);enableAllButtons(cartes18);break;
        }
    }//GEN-LAST:event_difficulteActionPerformed

    private void carte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carte1ActionPerformed
        // TODO add your handling code here:
        SelectedModeAndCompare(carte1);
    }//GEN-LAST:event_carte1ActionPerformed

    private void carte7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carte7ActionPerformed
        // TODO add your handling code here:
        SelectedModeAndCompare(carte7);
    }//GEN-LAST:event_carte7ActionPerformed

    private void carte13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carte13ActionPerformed
        // TODO add your handling code here:
        SelectedModeAndCompare(carte13);
    }//GEN-LAST:event_carte13ActionPerformed

    private void carte18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carte18ActionPerformed
        // TODO add your handling code here:
        SelectedModeAndCompare(carte18);
    }//GEN-LAST:event_carte18ActionPerformed

    private void carte12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carte12ActionPerformed
        // TODO add your handling code here:
        SelectedModeAndCompare(carte12);
    }//GEN-LAST:event_carte12ActionPerformed

    private void carte6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carte6ActionPerformed
        // TODO add your handling code here:
        SelectedModeAndCompare(carte6);
    }//GEN-LAST:event_carte6ActionPerformed

    private void carte14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carte14ActionPerformed
        // TODO add your handling code here:
        SelectedModeAndCompare(carte14);
    }//GEN-LAST:event_carte14ActionPerformed

    private void carte15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carte15ActionPerformed
        // TODO add your handling code here:
        SelectedModeAndCompare(carte15);
    }//GEN-LAST:event_carte15ActionPerformed

    private void carte16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carte16ActionPerformed
        // TODO add your handling code here:
        SelectedModeAndCompare(carte16);
    }//GEN-LAST:event_carte16ActionPerformed

    private void carte17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carte17ActionPerformed
        // TODO add your handling code here:
        SelectedModeAndCompare(carte17);
    }//GEN-LAST:event_carte17ActionPerformed

    private void carte2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carte2ActionPerformed
        // TODO add your handling code here:
        SelectedModeAndCompare(carte2);
    }//GEN-LAST:event_carte2ActionPerformed

    private void carte3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carte3ActionPerformed
        // TODO add your handling code here:
        SelectedModeAndCompare(carte3);
    }//GEN-LAST:event_carte3ActionPerformed

    private void carte4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carte4ActionPerformed
        // TODO add your handling code here:
        SelectedModeAndCompare(carte4);
    }//GEN-LAST:event_carte4ActionPerformed

    private void carte5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carte5ActionPerformed
        // TODO add your handling code here:
        SelectedModeAndCompare(carte5);
    }//GEN-LAST:event_carte5ActionPerformed

    private void carte8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carte8ActionPerformed
        // TODO add your handling code here:
        SelectedModeAndCompare(carte8);
    }//GEN-LAST:event_carte8ActionPerformed

    private void carte9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carte9ActionPerformed
        // TODO add your handling code here:
        SelectedModeAndCompare(carte9);
    }//GEN-LAST:event_carte9ActionPerformed

    private void carte10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carte10ActionPerformed
        // TODO add your handling code here:
        SelectedModeAndCompare(carte10);
    }//GEN-LAST:event_carte10ActionPerformed

    private void carte11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carte11ActionPerformed
        // TODO add your handling code here:
        SelectedModeAndCompare(carte11);
    }//GEN-LAST:event_carte11ActionPerformed

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
            java.util.logging.Logger.getLogger(MemoryCartesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemoryCartesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemoryCartesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemoryCartesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemoryCartesFrame().setVisible(true);
            }
        });
    }
    
public void compare(JButton b,JButton[] tab){
    if (b.getBackground() != Color.WHITE) {
        return; // Ignore ce bouton et ne fait rien
    }
    comp[i] = b;
    index = getIndex(tab, b);
    clr = tableDeCouleur[index];
    setButtonColor(b,clr);

    if(i == 0){
        i++;
    }
    else{
        if(comp[i] == comp[i - 1]){
            // deux fois sur une meme carte
            i = 0;
            comp[i].setBackground(Color.white);
        }
        else{
            Timer timer = new Timer(500, e -> {
            // Actions to take after the delay
            if (comp[i].getBackground() == comp[i - 1].getBackground()) {
                //paires trouve
            } else {
                comp[i].setBackground(Color.white);
                comp[i - 1].setBackground(Color.white);
            }
            i = 0;
            });
            
            score += 1;
            LScore.setText("Le Coups: " + score);
            timer.setRepeats(false);
            timer.start();
        }
    }
    FinJeu(this, tab, score);
}
    
public static int getIndex(JButton[] carteS, JButton boutonRecherche) {
        for (int j = 0; j < carteS.length; j++) {
            if (carteS[j] == boutonRecherche) {
                return j;
            }
        }
        return 0;
    }

public static void FinJeu(Component Parentframe,JButton[] tab, int scr){
    boolean sta = false;
    for (JButton button : tab) {
        if(button.getBackground() == Color.WHITE){
            sta = true;
            break;
        }
    }
    if (sta == false){
        JOptionPane.showMessageDialog(Parentframe, "Partie Terminée \nVotre Total Coups est : " + scr, "Partie Terminée", JOptionPane.INFORMATION_MESSAGE);
    }    
}

public static void setButtonColor(JButton button, String colorName) {
        switch (colorName) {
            case "red":
            button.setBackground(Color.RED);
            break;
        case "green":
            button.setBackground(Color.GREEN);
            break;
        case "blue":
            button.setBackground(Color.BLUE);
            break;
        case "orange":
            button.setBackground(Color.ORANGE);
            break;
        case "yellow":
            button.setBackground(Color.YELLOW);
            break;
        case "pink":
            button.setBackground(Color.PINK);
            break;
        case "cyan":
            button.setBackground(Color.CYAN);
            break;
        case "magenta":
            button.setBackground(Color.MAGENTA);
            break;
        case "gray":
            button.setBackground(Color.GRAY);
            break;
        case "white":
            button.setBackground(Color.WHITE);
            break;
        case "black":
            button.setBackground(Color.BLACK);
            break;
        case "lightgray":
            button.setBackground(Color.LIGHT_GRAY);
            break;
        }
    }

public void enableAllButtons(JButton[] buttons) {
    for (JButton button : buttons) {
        if (button != null) {
            button.setEnabled(true);
            button.setBackground(Color.white);
        }
    }
}

public void SelectedModeAndCompare(JButton b) {
    String choix = (String)difficulte.getSelectedItem();
        switch(choix){
            case "Facile":compare(b,cartes8);break;
            case "Moyen":compare(b,cartes12);break;
            case "Difficile":compare(b,cartes18);break;
        }
}

public static String[] shuffleArray(String[] table) {
     List<String> list = new ArrayList<>(Arrays.asList(table));
     Collections.shuffle(list);

     return list.toArray(new String[0]);
 }   
    
    
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LScore;
    private javax.swing.JButton bRejouer;
    private javax.swing.JButton carte1;
    private javax.swing.JButton carte10;
    private javax.swing.JButton carte11;
    private javax.swing.JButton carte12;
    private javax.swing.JButton carte13;
    private javax.swing.JButton carte14;
    private javax.swing.JButton carte15;
    private javax.swing.JButton carte16;
    private javax.swing.JButton carte17;
    private javax.swing.JButton carte18;
    private javax.swing.JButton carte2;
    private javax.swing.JButton carte3;
    private javax.swing.JButton carte4;
    private javax.swing.JButton carte5;
    private javax.swing.JButton carte6;
    private javax.swing.JButton carte7;
    private javax.swing.JButton carte8;
    private javax.swing.JButton carte9;
    private javax.swing.JComboBox<String> difficulte;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}