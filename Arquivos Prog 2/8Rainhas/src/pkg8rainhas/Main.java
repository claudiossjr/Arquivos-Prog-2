/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8rainhas;

/**
 *
 * @author tc claudio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        _8Rainhas oi = new _8Rainhas();
        oi.backTrack(new int[8], -1);
    }
}
