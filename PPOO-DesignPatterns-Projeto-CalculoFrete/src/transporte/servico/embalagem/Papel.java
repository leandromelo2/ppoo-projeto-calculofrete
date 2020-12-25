package transporte.servico.embalagem;

public class Papel implements Embalagem {

    @Override
    public double calcularPrecoEmbalagem(double embalagem) {
        return embalagem +  1.25;
    }

//    @Override
//    public int calcularPrecoEmbalagem(Embalagem embalagem) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
}
