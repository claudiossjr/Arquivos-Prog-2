package treino;

public class Ordenacao 
{
    public static void selectionSort(IComparavel comparavel[])
    {
        IComparavel aux;
        int pos;
        for (int i = 0; i < comparavel.length; i++) 
        {
            pos = i;
            
            for (int j = i+1; j < comparavel.length; j++) 
            {
                if(comparavel[i].compararCom(comparavel[pos]) > 0)
                {
                    pos = j;
                }
                    
                aux = comparavel[i];
                comparavel[i] = comparavel[pos];
                comparavel[pos] = aux;
                    
            }
        }
    }
    
    public static void bubbleSort(IComparavel comparavel[])
    {
        IComparavel aux;
        for (int i = 0; i < comparavel.length ; i++) 
        {
            for (int j = i+1; j < comparavel.length; j++) 
            {
                if(comparavel[i].compararCom(comparavel[j]) > 0)
                {
                    aux = comparavel[i];
                    comparavel[i] = comparavel[j];
                    comparavel [j] = aux;
                }
            }
        }
    }
    
    public static void insertionSort(IComparavel comparavel[])
    {
        IComparavel aux;
        for (int i = 1 ; i < comparavel.length; i++) 
        {
            aux = comparavel[i];
            for (int j = i-1; j >= 0 && comparavel[j].compararCom(aux) < 0 ; j++) 
            {
                comparavel[j+1] = comparavel[j];
                comparavel[j] = aux;
            }
        }
    }
    
    
}
