/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author tc claudio
 */
public class MainCalc {
    public static void main(String[] args) {
        Calc2 cal = new Calc2();
        System.out.println("Resultado é: "+cal.resolveProblema(args[0])); 
    }
}
