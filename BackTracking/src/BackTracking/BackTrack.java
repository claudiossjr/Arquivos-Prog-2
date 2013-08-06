/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BackTracking;

/**
 *
 * @author tc claudio
 */
public class BackTrack {
        
    
    public void backTracking(int a[], int k){
        if(isSolution(a,k)){
            processSolution(a,k);
        }else{
            k++;
            
            int c[] = construction(a,k);
            
            for (int i = 0; i < c.length; i++) {
                a[k] = c[i];
                backTracking(a,k);
            }
        }
    }

    private int[] construction(int a[], int k){
        boolean inPerm[] = new boolean[a.length];
        
        for (int i = 0; i < k; i++) {
            inPerm[a[i]] = true;
        }
        
        int c[] = new int[(a.length-k)]; 
        
        for (int i = 0, j=0; i < inPerm.length; i++) {
            if(!inPerm[i]){
                c[j++] = i;
            }
        }
        
        return c;
    }

    private void processSolution(int[] a, int k) {
        System.out.print("{");
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        
        System.out.println(" }");
    }

    private boolean isSolution(int[] a, int k) {
        return((k+1) == a.length);
    }
}
