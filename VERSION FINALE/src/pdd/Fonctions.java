/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pdd;
import java.util.*;
import javax.swing.JButton;
/**
 *
 * @author PC
 */
public class Fonctions {
    
    
    public static void setAllButtonsVisible(JButton[] buttons,boolean b ) {
        for (JButton button : buttons) {
            button.setVisible(b);
        }
    }

    // Method to shuffle an array of colors (or any array)
    public static String[] shuffleArray(String[] table) {
        List<String> list = new ArrayList<>(Arrays.asList(table)); // Convert array to a List
        Collections.shuffle(list);  // Shuffle the list
        return list.toArray(new String[0]);  // Convert the list back to an array
    }
    
    public static JButton[] shuffleButtons(JButton[] buttons) {
        Random random = new Random();
        for (int k = buttons.length - 1; k > 0; k--) {
            int j = random.nextInt(k + 1); // Génère un index aléatoire entre 0 et i
            // Échange des éléments
            JButton temp = buttons[k];
            buttons[k] = buttons[j];
            buttons[j] = temp;
        }
        return buttons; // Retourne le tableau mélangé
    }
    
}
