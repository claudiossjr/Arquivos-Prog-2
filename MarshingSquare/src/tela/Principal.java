/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author tc claudio
 */
public class Principal {
    public static void main(String[] args) {
        double min =-100;// Double.parseDouble(JOptionPane.showInputDialog(null, "insira o minimo"));
        double max =100;// Double.parseDouble(JOptionPane.showInputDialog(null, "insira o maximo"));
        int resolucao =100;// Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a resolução"));
        DrawPanel pane = new DrawPanel(min,min,max,max,resolucao);
        
        JFrame frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(pane);
        frame.setSize(816, 638);
        frame.setVisible(true);
    }
}
