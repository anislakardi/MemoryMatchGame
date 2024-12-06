/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memorycartes;
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

    public static String[] shuffleArray(String[] table) {
        List<String> list = new ArrayList<>(Arrays.asList(table));
        Collections.shuffle(list);
        return list.toArray(new String[0]);
    }
    
    public static JButton[] shuffleButtons(JButton[] buttons) {
        Random random = new Random();
        for (int k = buttons.length - 1; k > 0; k--) {
            int j = random.nextInt(k + 1);
            
            JButton temp = buttons[k];
            buttons[k] = buttons[j];
            buttons[j] = temp;
        }
        return buttons;
    }
    
}
