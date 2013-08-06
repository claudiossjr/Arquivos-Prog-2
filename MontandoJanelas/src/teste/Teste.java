/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author tc claudio
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String name = JOptionPane.showInputDialog("Qual é o seu nome ?");
//        JOptionPane.showMessageDialog(null, "Olá "+name);
        
        DrawPanel panel = new DrawPanel();
        
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        application.add(panel);
        application.setSize(800, 600);
        application.setVisible(true);
    }
}
