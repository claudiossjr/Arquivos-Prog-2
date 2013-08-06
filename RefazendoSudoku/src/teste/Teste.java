/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import Logica.BackTrackingSudoku;

/**
 *
 * @author tc claudio
 */
public class Teste {

    public static void main(String[] args) {
        BackTrackingSudoku bs = new BackTrackingSudoku();
        int a[][] = {{9, 4, 0, 1, 0, 4, 0, 5, 8},
                     {6, 0, 0, 0, 5, 0, 0, 0, 4},
                     {0, 0, 2, 4, 0, 3, 1, 0, 0},
                     {0, 2, 0, 0, 0, 0, 0, 6, 0},
                     {5, 0, 8, 0, 2, 0, 4, 0, 1},
                     {0, 6, 0, 0, 0, 0, 0, 8, 0},
                     {0, 0, 1, 6, 0, 8, 7, 0, 0},
                     {7, 0, 0, 0, 4, 0, 0, 0, 3},
                     {4, 3, 0, 5, 0, 9, 0, 1, 2}};
        bs.backTracking(new int[9][9], -1);
    }
}
