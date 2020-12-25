package transporte.servico;

import transporte.servico.frete.StrategyFrete;
import transporte.servico.frete.Normal;
import transporte.servico.frete.PAC;
import transporte.servico.frete.Sedex;

public enum FabricaTipoFrete {
    
        PAC {
		@Override
		public StrategyFrete obtFrete() {
			return new PAC();
		}
	},
	NORMAL {
		@Override
		public StrategyFrete obtFrete() {
			return new Normal();
		}
	},
	SEDEX {
		@Override
		public StrategyFrete obtFrete() {
			return new Sedex();
		}
	};
	
	public abstract StrategyFrete obtFrete();
	
}
