package transporte.servico;

import transporte.servico.embalagem.Embalagem;
import transporte.servico.embalagem.Papel;
import transporte.servico.embalagem.Plastico;
import transporte.servico.embalagem.PlasticoBolha;
import transporte.servico.frete.PAC;
import transporte.servico.frete.Sedex;

public enum FabricaTipoEmbalagem {
    
        PAPEL {
		@Override
		public Embalagem obtEmbalagem() {
			return new Papel();
		}
	},
	PLASTICO {
		@Override
		public Embalagem obtEmbalagem() {
			return new Plastico();
		}
	},
	PLASTICOBOLHA {
		@Override
		public Embalagem obtEmbalagem() {
			return new PlasticoBolha();
		}
	};
	
	public abstract Embalagem obtEmbalagem();
	
}
