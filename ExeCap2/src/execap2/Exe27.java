
package execap2;

import java.util.Scanner;

public class Exe27 {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Insira as cordenadas Ponto superior esquerdo(x3,y3): ");
        int iXP3 = Teclado.nextInt();
        int iYP3 = Teclado.nextInt();
        
        System.out.println("Insira as Cordenadas inferior direito(x1,y1): ");
        int iXP1 = Teclado.nextInt();
        int iYP1 = Teclado.nextInt();
        
        float fltRaio =(float)(iXP3 - iXP1)/2;
        
        float iXCentro = iXP1 + fltRaio;
        float iYCentro = iYP1 + fltRaio;
        
        float iXCentro1 = iXP3 - fltRaio;
        float iYCentro1 = iYP3 - fltRaio;
        
        if ((iXCentro == iXCentro1)&&(iYCentro == iYCentro1)){
        System.out.println("As Cordenadas do centro são: ("+iXCentro+","+iYCentro+")");
        System.out.println("O Raio é"+fltRaio);
        }        
    }
}
