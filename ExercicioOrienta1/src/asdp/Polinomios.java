package asdp;

public class Polinomios {
    protected int grau;
    protected float coeficientes[] = new float[grau];

    public int getGrau() {
        return grau;
    }
    
    public void criarPoly(float[] a ) {
        grau = a.length;
        
        for (int i = 0; i < a.length; i++) 
        {
            coeficientes[i] = a[i];
        }
    }
    
    public void setGrau(int grau) {
        this.grau = grau;
    }

    public float[] getCoeficientes() {
        return coeficientes;
    }

    public void setCoeficiente(int indice, float coeficiente) {
        this.coeficientes[indice] = coeficiente;
    }
    
    public Polinomios somarPoly(Polinomios P1) {
        Polinomios P2 = new Polinomios();
        int grauResultante = 0;
        
        if(this.grau == P1.getGrau())
        {
            P2.setGrau(grau);
        }
        else if(this.grau > P1.getGrau())
        {
            P2.setGrau(grau);
            grauResultante = this.grau - P1.getGrau();
        }
        else
        {
            P2.setGrau(P1.getGrau());
            grauResultante = P1.getGrau() - this.grau;
        }
        
        if(grauResultante != 0)
        {
            for (int i = 0; i < grauResultante; i++) 
            {
                P2.setCoeficiente(i,this.coeficientes[i]);
            }
            
            for (int i = 0; i < P2.getCoeficientes().length; i++) 
            {
                P2.setCoeficiente(i,(this.coeficientes[i] + P1.getCoeficientes()[i]));
            }
        }
        else
        {
            for (int i = 0; i < P2.getCoeficientes().length; i++) 
            {
                P2.setCoeficiente(i,(this.coeficientes[i] + P1.getCoeficientes()[i]));
            }
        }
        
        return P2;
    }
    
    public Polinomios multiPoly(Polinomios P1){
        Polinomios P2 = new Polinomios();
        
        return P2;
    }
}
