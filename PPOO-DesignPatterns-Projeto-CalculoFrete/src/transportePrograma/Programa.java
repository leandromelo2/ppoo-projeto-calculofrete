package transportePrograma;

import java.util.Scanner;

import transporte.servico.frete.StrategyFrete;
import transporte.servico.FabricaTipoFrete;
import javax.swing.JOptionPane;
import transporte.servico.FabricaTipoEmbalagem;
import transporte.servico.embalagem.Embalagem;

public class Programa {

    public static void main(String[] args) {
        
        double peso = 0;
        double embalagem = 0;
        int local = 0;
        int opcFrete = 0;
        int opcEmbalagem = 0;
        double totalpreco = 0;
            
	try(Scanner entrada = new Scanner(System.in)) {
            
            JOptionPane.showMessageDialog(null,"Programa para calcular o frete");
                    
            peso = Integer.parseInt(JOptionPane.showInputDialog("Informe o peso do produto (em grama): "));  
            
            opcFrete = Integer.parseInt(JOptionPane.showInputDialog("Qual o tipo de frete: (1) PAC, (2) Normal, (3) Sedex: "));                       
            FabricaTipoFrete tipoFrete = FabricaTipoFrete.values()[opcFrete -1];            
            System.out.println(tipoFrete);            
//            FabricaTipoFrete tipoNormal = FabricaTipoFrete.NORMAL;           
			
            StrategyFrete frete = tipoFrete.obtFrete();
            double preco = frete.calcularPreco(peso);
                                                
            opcEmbalagem = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo de embalagem: (1) Papel, (2) Plástico, (3) Plástico bolha,   "));
            FabricaTipoEmbalagem tipoEmbalagem = FabricaTipoEmbalagem.values()[opcEmbalagem -1];
            
            Embalagem freteembalagem = tipoEmbalagem.obtEmbalagem();
            double precoEmbalagem = freteembalagem.calcularPrecoEmbalagem(embalagem);
            
            totalpreco = preco + precoEmbalagem;
        
            System.out.printf("O Valor total do frete " + tipoFrete + " fica R$  "+ preco +" Valor da embalagem: "+ precoEmbalagem +"\n");
            System.out.printf("O Valor total a pagar é " + totalpreco + "\n");
            
            JOptionPane.showMessageDialog(null,"O Valor frete " + tipoFrete + ": R$  "+ preco + ", Valor da Embalagem:  R$ " + precoEmbalagem );
            JOptionPane.showMessageDialog(null,"O Valor total a pagar é: " + totalpreco );
          
            
            }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Houve um erro! Reinicie e Tente novamente" );
            }
	}
}
