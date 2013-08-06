package Passeio;

public class Casa {
    
    private int j, i;
    private boolean [][] mat =  mat = new boolean [8][8];
    
    public Casa(int i, int j){
       mat [i][j] = true; 
    }
    
    
    public boolean casaOcupada(int i, int j){
        if(mat[i][j])
            return true;
        return false;
    }
    
    public boolean eCandidato (int i, int j){
        if(i<=7 && i>=0 && j<=7 && j>=0 && !mat[i][j])
            return true;
        return false;
    }
    
    
    
}
