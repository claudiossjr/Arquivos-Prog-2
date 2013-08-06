package pkg02052012;

public class Ordena {
    

    public static void quickSort(int alfa[], int inicio, int finals) {
        int j;
        if(inicio<finals){
            j = partition( alfa ,inicio,finals);
            quickSort(alfa, inicio, finals-1);
            quickSort(alfa, j+1, finals);
        }
    }
    
    private  static int partition(int a[], int inicio, int finals){
        int i = inicio;
        int j = finals;
        int pivot = a[i];
        
        do{
            do{i++;}while(a[i] < pivot);
            
            do{j--;}while(a[j] > pivot);
            
            if(i<j) {
                exchange(a,i,j);
            }
                
        }while(i < j);
        exchange(a,pivot,j);
        return j;
    }
    
    private static void exchange(int[] a, int pos1, int pos2){
        int temp;
        temp = a[pos1];
        a[pos1] = a[pos2];
        a[pos2] = temp;
    }
}
