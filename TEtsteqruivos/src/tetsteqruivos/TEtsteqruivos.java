package tetsteqruivos;

import java.io.*;

public class TEtsteqruivos {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("teste.txt"); 
        BufferedWriter bw = new BufferedWriter(fw);
        
        for (int i = 0; i < 214 ; i++) {
            if (ePrimo(i) && i != 0){
            String j = i+"";
            bw.write(j);
            bw.newLine();
            }
        }
        bw.close();
    }
    
    private static boolean ePrimo(int n){
        int cont =0;
        
        for (int i = 2; i < n-1; i++) {
            if (n % i == 0){
               cont ++;
               break;
            }
            
        }
        
        if(cont == 0)
        {
            return true;
        }else{
            return false;
        }
    }
}
