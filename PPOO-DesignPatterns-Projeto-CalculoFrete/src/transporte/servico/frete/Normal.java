package transporte.servico.frete;

import javax.swing.JOptionPane;

public class Normal implements StrategyFrete {
    
    public double calcularPreco(double peso) { 
        

        double p;           
        p = (double)peso;            
        p = p * 0.06 + 4;            
        peso = (int)p;		
        return peso;
    }		
}