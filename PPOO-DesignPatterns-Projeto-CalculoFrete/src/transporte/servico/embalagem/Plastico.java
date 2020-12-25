package transporte.servico.embalagem;

public class Plastico implements Embalagem {

    @Override
    public double calcularPrecoEmbalagem(double embalagem) {
        return embalagem +  2;
    }

//    @Override
//    public int calcularPrecoEmbalagem(Embalagem embalagem) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
}
