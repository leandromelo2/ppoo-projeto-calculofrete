package transporte.servico.frete;

public class PAC implements StrategyFrete {
    
    public double calcularPreco(double peso) {         
        double p;           
        p = (double)peso;            
        p = p * 0.08 + 9;            
        peso = (int)p;		
        return peso;
    }		
}