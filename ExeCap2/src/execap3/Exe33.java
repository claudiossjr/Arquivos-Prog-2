
package execap3;

import java.util.Scanner;

public class Exe33 {
    
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Insira um valor inteiro: ");
        int iValor = Teclado.nextInt();
        
        switch (iValor){
            case 1:
            case 2:
                System.out.println("Valor 1 ou 2");
                break;
            case 3:
            case 4:
                System.out.println("Valor 3 ou 4");                
                break;
            default:
                System.out.println("Valor não pertence ao intervalo de [1,4]");
        }
    }
}
