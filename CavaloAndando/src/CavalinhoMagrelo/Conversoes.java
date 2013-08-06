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
    
    public static boolean podeCriar(int i, int j){
        if(i >= 0 && i <= 7 && j >= 0 && j <= 7){
            return true;
        }
        return false;
    }
    
    public static int moveXY(int t, int id){
        int i= t/8, j= t%8;
        switch(id){
            case 0:
                i +=2;
                j+= 1;
                if(podeCriar(i, j))return (i*8 + j);
                return -1;
            case 1: 
                
                i+=1;
                j+=2;
                if(podeCriar(i, j))return (i*8 + j);
                return -1;
            case 2: 
                i -=2;
                j -= 1;
                if(podeCriar(i, j))return (i*8 + j);
                return -1;
            case 3: 
                i-=1;
                j -= 2;
                if(podeCriar(i, j))return (i*8 + j);
                return -1;
            case 4: 
                i-= 2;
                j+= 1;
                if(podeCriar(i, j))return (i*8 + j);
                return -1;
            case 5: 
                i+=2;
                j-= 1;
                if(podeCriar(i, j))return (i*8 + j);
                return -1;
            case 6: 
                i+=1;
                j -=2;
                if(podeCriar(i, j))return (i*8 + j);
                return -1;
            case 7: 
                i-= 1;
                j+= 2;
                if(podeCriar(i, j))return (i*8 + j);
                return -1;
        }
        return 0;
    }
}
