/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Passeio;

/**
 *
 * @author claudio
 */
public class PasseioBurro {
    
    protected boolean acabou;
    protected boolean passou [][] = new boolean[8][8];
    
    public void  backTracking(int a[], int k){
        if(isSolution(a,k)){
            ProcessSolution(a,k);
            acabou = true;
        }else{
            k++;
            
            int c[] = Construction(a,k);
            
            for (int i = 0; i < c.length; i++) {
                a[k] = c[i];
                backTracking(a,k);
                
                if(acabou){
                    return;
                }
            }
        }
    }

    private int[] Construction(int[] a, int k) {
        int tamanho = 0;
        
        for (int i = 0; i < 8; i++) {
            
            int valor = moveXY(a[k],i);
            int linha = valor/8, coluna = valor%8;
            passouCasa(linha,coluna);
            if (isCandidate(a,a[k])){
                tamanho++;
            }
                
        }
        
        int c [] = new int[tamanho]; 
        
        for (int i = 0; i < c.length; i++) {
            int valor = moveXY(a[k],i);
            if (isCandidate(a,a[k])){
                c[i] = valor;
            }
        }
        return c;   
    }

    private void ProcessSolution(int[] a, int k) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("( " + a[i]/8+ " , " +a[i]%8 + " )");
            }
            
        }
    
    private boolean isSolution(int[] a, int k) {
        return (k+1) == (a.length);
    }
    
    private int moveXY(int a, int id){
        switch(id){
            case 0:
                int linha = a/8 , coluna= a%8;
                linha = linha +2;
                coluna = coluna + 1;
                return (linha*8 + coluna);
            case 1: 
                int linha1 = a/8 , coluna1= a%8;
                linha1 = linha1 +1;
                coluna1 = coluna1 +2;
                return (linha1*8 + coluna1);
            case 2: 
                int linha2 = a/8 , coluna2= a%8;
                linha2 = linha2 -2;
                coluna2 = coluna2 - 1;
                return (linha2*8 + coluna2);
            case 3: 
                int linha3 = a/8 , coluna3= a%8;
                linha3 = linha3 -1;
                coluna3 = coluna3 -2;
                return (linha3*8 + coluna3);
            case 4: 
                int linha4 = a/8 , coluna4= a%8;
                linha4 = linha4 -2;
                coluna4 = coluna4 + 1;
                return (linha4*8 + coluna4);
            case 5: 
                int linha5 = a/8 , coluna5= a%8;
                linha5 = linha5 +2;
                coluna5 = coluna5 - 1;
                return (linha5*8 + coluna5);
            case 6: 
                int linha6 = a/8 , coluna6= a%8;
                linha6 = linha6+1;
                coluna6 = coluna6 -2;
                return (linha6*8 + coluna6);
            case 7: 
                int linha7 = a/8 , coluna7= a%8;
                linha7 = linha7 -1;
                coluna7 = coluna7 + 2;
                return (linha7*8 + coluna7);
        }
        return 0;
    }
    
    private boolean isCandidate(int a[],int b){
        int linha = b/8, coluna = b%8;
        
        if (linha >=0 && linha <=7 && coluna >= 0 && coluna <= 7 && !passou(a,b)){
            return true;
        }
        return false;
    }
    
    private boolean passou(int a[], int b){
        int linha = b/8, coluna = b%8;
        
        for (int i = 0; i < a.length; i++) {
            int linha1 = a[i]/8, coluna1 = a[i]%8;
            
            if(linha == linha1 && coluna == coluna1){
                return false;
            }
        }
        
        return true;
    }
    
    private void passouCasa(int i, int j){
        passou[i][j] = true;
    }
}
