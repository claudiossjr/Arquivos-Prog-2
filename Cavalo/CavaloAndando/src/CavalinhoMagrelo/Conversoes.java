/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CavalinhoMagrelo;

/**
 *
 * @author claudio
 */
public class Conversoes {
    
    public static int converteParaK(int linha, int coluna){
        return (linha*8 + coluna);
    }
    
    public static int converteI(int t){
        return t/8;
    }
    
    public static int converteJ(int t){
        return t%8;
    }
    
    public static boolean podeCriar(int t){
        int i = converteI(t);
        int j = converteJ(t);
        
        if(i >= 0 && i <= 7 && j >= 0 && j <= 7){
            return true;
        }
        return false;
    }
    
    public static int moveXY(int t, int id){
        int i = converteI(t), j = converteJ(t);
        
        switch(id){
            case 0:
                int linha = t/8 , coluna= t%8;
                linha = linha +2;
                coluna = coluna + 1;
                return (linha*8 + coluna);
            case 1: 
                int linha1 = t/8 , coluna1= t%8;
                linha1 = linha1 +1;
                coluna1 = coluna1 +2;
                return (linha1*8 + coluna1);
            case 2: 
                int linha2 = t/8 , coluna2= t%8;
                linha2 = linha2 -2;
                coluna2 = coluna2 - 1;
                return (linha2*8 + coluna2);
            case 3: 
                int linha3 = t/8 , coluna3= t%8;
                linha3 = linha3 -1;
                coluna3 = coluna3 -2;
                return (linha3*8 + coluna3);
            case 4: 
                int linha4 = t/8 , coluna4= t%8;
                linha4 = linha4 -2;
                coluna4 = coluna4 + 1;
                return (linha4*8 + coluna4);
            case 5: 
                int linha5 = t/8 , coluna5= t%8;
                linha5 = linha5 +2;
                coluna5 = coluna5 - 1;
                return (linha5*8 + coluna5);
            case 6: 
                int linha6 = t/8 , coluna6= t%8;
                linha6 = linha6+1;
                coluna6 = coluna6 -2;
                return (linha6*8 + coluna6);
            case 7: 
                int linha7 = t/8 , coluna7= t%8;
                linha7 = linha7 -1;
                coluna7 = coluna7 + 2;
                return (linha7*8 + coluna7);
        }
        return 0;
    }
}
