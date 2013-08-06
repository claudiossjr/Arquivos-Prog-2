package teste;

import CavalinhoMagrelo.Caminhada;
import CavalinhoMagrelo.Casa;

public class Teste {

    public static void main(String[] args) {
        Caminhada cm = new Caminhada();
        Casa taboleiro[] = new Casa[64];
        inicializaCas(taboleiro);
        int tabuleiro[] = new int[64];
        cm.backTracking(tabuleiro, 0, taboleiro);
    }
    
    public static void inicializaCas(Casa []tab){
        for (int i = 0; i < tab.length; i++) {
            tab[i] = new Casa();
        }
    }
}
