/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos;

import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;

/**
 *
 * @author tc claudio
 */
public class Arquivo1 {

    public static void criaArq(String name) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(name, "rw");

        for (int i = 0; i < 30; i++) {
            int j = (int) (1 + Math.random() * 80);
            raf.writeInt(j);
        }
        raf.close();
        //bubbleSortR(name, 0);
        ordenaRAF(name);
    }

    public static void leArq(String name) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(name, "rw");

        for (int i = 0; i < raf.length(); i += 4) {
            int j = raf.readInt();
            System.out.println(j);
        }
        raf.close();
    }

    private static void ordenaRAF(String name) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(name, "rw");
        for (int i = 0; i < raf.length() - 4; i += 4) {
            raf.seek(i);
            int comp = raf.readInt();
            for (int j = i; j < raf.length(); j += 4) {
                raf.seek(j);
                int compfin = raf.readInt();

                if (comp > compfin) {
                    int aux = comp;
                    comp = compfin;
                    compfin = aux;
                    gravaTroca(name, i, j, comp, compfin);
                }
            }
        }
    }

    private static void gravaTroca(String name, int i, int j, int comp, int compfin) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(name, "rw");
        raf.seek(i);
        raf.writeInt(comp);
        raf.seek(j);
        raf.writeInt(compfin);
        raf.close();
    }

    public static void bubbleSortR(String name, int i) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(name, "rw");
        if (i > raf.length() - 4) {
            return;
        } else {
            raf.seek(i);
            int comp = raf.readInt();
            for (int j = i; j < raf.length(); j += 4) {
                raf.seek(j);
                int compfin = raf.readInt();

                if (comp > compfin) {
                    int aux = comp;
                    comp = compfin;
                    compfin = aux;
                    gravaTroca(name, i, j, comp, compfin);
                }
            }
            bubbleSortR(name, i += 4);
        }
    }

    public static boolean mistura(String name, String name1, String saida) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(name, "rw");
        RandomAccessFile raf1 = new RandomAccessFile(name1, "rw");
        RandomAccessFile raf2 = new RandomAccessFile(saida, "rw");

        for (int i = 0; i < raf.length(); i += 4) {
            raf.seek(i);
            int comp = raf.readInt();
            for (int j = 0; j < raf1.length(); j += 4) {
                raf1.seek(j);
                int comp1 = raf1.readInt();

                if (comp == comp1 && !(isArq(saida,comp))) {
                    raf2.writeInt(comp);
                }
            }
        }

        raf.close();
        raf1.close();
        raf2.close();

        return false;
    }
    
    private static boolean isArq(String name,int n)throws IOException{
        RandomAccessFile raf = new RandomAccessFile(name,"rw");
        for (int i = 0; i < raf.length(); i+=4) {
            raf.seek(i);
            int comp = raf.readInt();
            if(comp == n) return true;
        }
        return false;
    }
}
