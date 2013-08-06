/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8rainhas;

/**
 * k = i * Ncol + j ==> para calcular em um vetor representando matriz
 * paravoltar  i = k/8 e j = k%8 ==> achando as cordenadas
 * @author tc claudio
 */
public class _8Rainhas {
    protected boolean achei = false;
    
    public void backTrack(int a[], int k){
        if(isSolution(a,k)){
            processSolution(a,k);
            achei = true;
        }else{
            k++;
            
            int c[] = construction(a,k);
            
            for (int i = 0; i < c.length; i++) {
                if(c[i] == -1) break;
                
                a[k] = c[i];
                backTrack(a, k);
                
                if(achei)
                    return;
            }
        }
    }

    private void processSolution(int a[], int k) {
        for (int i = 0; i < a.length; i++) {
            int j = a[i]/8;
            int l = a[i]%8;
            System.out.println("("+j+" , "+l+")");
        }
    }
    
    private boolean isSolution(int a[], int k){
        return ((k+1) == a.length);
    }
    
    private int[] construction(int a[], int k){
        int c[]= new int [64]; 
        
        for (int i = 0; i < c.length; i++) {
            c[i] = -1;
        }
        
        int pos = 0;
        
        for (int l = 0; l < 64; l++) {
            
            int t = l/8 ;
            int s = l%8 ;
            
            boolean passou = true;
            
            for (int i = 0; i < k; i++) {
                int ta = a[i]/8;
                int sa = a[i]%8;
                
                int td = Math.abs(ta-t) , sd = Math.abs(sa-s);
                
                if( ta == t || sa == s || td == sd){
                    passou = false;
                    break;
                }
            }
            
            if (passou){
                c [pos++] = l;
            }
        }
        
        return c;
    }
}
