
package execap2;

import java.util.Scanner;


public class Exe29 {
    
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        
        System.out.println("Insira as cordenadas do Ponto 1: ");
        int iXP1 = Teclado.nextInt();
        int iYP1 = Teclado.nextInt();
        System.out.println("Insira as cordenadas do Ponto 2: ");
        int iXP2 = Teclado.nextInt();
        int iYP2 = Teclado.nextInt();
        System.out.println("Insira as cordenadas do Ponto 3: ");
        int iXP3 = Teclado.nextInt();             
        int iYP3 = Teclado.nextInt();
        
        float fltD12 = (float)Math.sqrt((Math.pow(iXP1-iXP2, 2)+Math.pow(iYP1-iYP2,2)));
        float fltD13 = (float)Math.sqrt((Math.pow(iXP1-iXP3, 2)+Math.pow(iYP1-iYP3,2)));
        float fltD23 = (float)Math.sqrt((Math.pow(iXP2-iXP3, 2)+Math.pow(iYP2-iYP3,2)));
        
        float fltPer = fltD12+fltD13+fltD23;
        
        System.out.println("O Perimetro: "+fltPer);
    }
  
}
