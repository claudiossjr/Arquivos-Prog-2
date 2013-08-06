package exercicio6;

public class ReduzString 
{
    public static String reduzindo(String palavras)
    {
        int cont = palavras.indexOf("\\");
        String palavra1 = palavras.substring(cont+1) ;
       
        for (int i = 0; i < palavra1.length(); i++) 
        {
            cont = palavra1.indexOf("\\");
            palavra1 = palavra1.substring(cont+1);
        }
                
        return palavra1;
    }
}
