
package execap2;

import java.util.Scanner;

public class Exe28 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        
        System.out.println("Insira o tempo em segundo: ");
        float fltTempo = Teclado.nextFloat();
        float fltEspaco = (float)(fltTempo*340);
        
        System.out.println("A distancia é igual a: "+fltEspaco/1000+" Km");
    }
}
