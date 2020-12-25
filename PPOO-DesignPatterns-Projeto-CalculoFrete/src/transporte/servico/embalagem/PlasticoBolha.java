package transporte.servico.embalagem;

public class PlasticoBolha implements Embalagem {

    @Override
    public double calcularPrecoEmbalagem(double embalagem) {
        return embalagem +  3.50;
//        throw new UnsupportedOperationException("Not supported yet."); 
    }

//    @Override
//    public int calcularPrecoEmbalagem(Embalagem embalagem) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
}
