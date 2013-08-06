/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

/**
 *
 * @author tc claudio
 */
public class ExercicioIV {

    public static boolean buscaTernaria(int a[], int n, int inicio, int fim) {
        if (inicio > fim) {
            return false;
        } else {

            int meio1 = ((fim - inicio) / 3) + inicio, meio2 = ((fim - inicio) * 2 / 3) + inicio;

            if (a[meio1] == n || a[meio2] == n) {
                return true;

            } else {
                if (a[(meio1)] > n) {
                    return buscaTernaria(a, n, inicio, (meio1) - 1);
                } else {
                    if (a[(meio1)] < n && a[(meio2)] > n) {
                        return buscaTernaria(a, n, ((meio1) + 1), ((meio2) - 1));
                    } else {
                        if (a[(meio2)] < n) {
                            return buscaTernaria(a, n, ((meio2) + 1), fim);
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean buscaTernariaI(int a[], int valor) {
        int inicio = 0, fim = a.length - 1;

        while (inicio <= fim) {
            int meio = ((fim - inicio) / 3) + inicio, meio1 = ((fim - inicio) * 2 / 3) + inicio;
            if (a[meio] == valor || a[meio1] == valor) {
                return true;
            } else {
                if (valor < a[meio]) {
                    fim = (meio - 1);
                } else {
                    if (valor > a[meio] && valor < a[meio1]) {
                        inicio = (meio + 1);
                        fim = (meio1 - 1);
                    } else {
                        if (valor > a[meio1]) {
                            inicio = meio1 + 1;
                        }
                    }
                }
            }
        }
        return false;
    }
}
