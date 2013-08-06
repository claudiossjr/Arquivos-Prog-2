/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package anali.String;

import pilha.Pilha;

/**
 *
 * @author lcc
 */
public class Analise {
    public static boolean analiPilha(String exp, Pilha pl) {
        char[] c = exp.toCharArray();
        for (int i = 0; i < c.length; i++) {
            switch (c[i]) {
                case '{':
                    pl.push(c[i]);
                    break;
                case '(':
                    pl.push(c[i]);
                    break;
                case '[':
                    pl.push(c[i]);
                    break;
                case ']':
                    if ((Character) pl.top() == '[') {
                        pl.pop();
                        break;
                    } else {
                        return false;
                    }
                case ')':
                    if ((Character) pl.top() == '(') {
                        pl.pop();
                        break;
                    } else {
                        return false;
                    }
                case '}':
                    if ((Character) pl.top() == '{') {
                        pl.pop();
                        break;
                    } else {
                        return false;
                    }
                    
            }
        }
        return true;
    }
}
