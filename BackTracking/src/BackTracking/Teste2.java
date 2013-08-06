/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BackTracking;

/**
 *
 * @author tc claudio
 */
public class Teste2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        BackTrack bt = new BackTrack();
        bt.backTracking(a, -1);
    }
}
