package calculadora;

import java.util.Scanner;
import pilha_fila_array.ArrayStack;

public class Calc {

    protected ArrayStack pilha;

    public Calc() {
        pilha = new ArrayStack();
    }

    public float resolveProblema(String re) {
        Scanner in = new Scanner(re);
        while (in.hasNext()) {
            String aux = in.next();
            if (")".equals(aux)) {
                float resultTemp;
                float iTemp = (Float) pilha.pop();
                char chaRemp = ((String) pilha.pop()).charAt(0);
                float iTemp1 = (Float) pilha.pop();
                switch (chaRemp) {
                    case '+':
                        resultTemp = iTemp + iTemp1;
                        pilha.pop();
                        pilha.push(resultTemp);
                        break;
                    case '-':
                        resultTemp = iTemp - iTemp1;
                        pilha.pop();
                        pilha.push(resultTemp);
                        break;
                    case '*':
                        resultTemp = iTemp * iTemp1;
                        pilha.pop();
                        pilha.push(resultTemp);
                        break;
                    case '/':
                        resultTemp = iTemp1 / iTemp;
                        pilha.pop();
                        pilha.push(resultTemp);
                        break;
                }
            } else {
                if ("(".equals(aux) || "+".equals(aux) || "-".equals(aux) || "/".equals(aux) || "*".equals(aux)) {
                    pilha.push(aux);
                } else {
                    pilha.push(Float.parseFloat(aux));
                }
            }
        }
        return (float) pilha.pop();
    }
}