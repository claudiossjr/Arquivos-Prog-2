/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author tc claudio
 */
public class DrawPanel extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = 400;
        int height = 300;
        int multi = -10;

        g.drawLine(100, 100, 101, 101);
    }
}
