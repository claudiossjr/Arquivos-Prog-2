/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import Passeio.PasseioBurro;

/**
 *
 * @author claudio
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PasseioBurro pb = new PasseioBurro();
        pb.backTracking(new int[64], -1);
    }
}
