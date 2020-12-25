package transporte.servico.frete;

public class Sedex implements StrategyFrete {

    public double calcularPreco(double peso) {         
        double p;           
        p = (double)peso;            
        p = p * 0.09 + 10;            
        peso = (int)p;		
        return peso;
    }		
}
