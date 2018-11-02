package Tabuleiro;

public class Peça {
	
	// para não exibir mn regra de noegocio minha posicao de matriz referente a posicao da peça
	
	protected Posicao posicao;
	private TabuleiroPeça tabuleiropeça;
	
	//crie apenas  using Fields para Peça.. Todavia subtendi que a peça não esta posicionada ainda no tabuleiro
	
	public Peça(TabuleiroPeça tabuleiropeça) {
	
		this.tabuleiropeça = tabuleiropeça;
		posicao = null;
	}

	// Acessivel apenas pela camada Tabuleiro usar "peotected"
	protected TabuleiroPeça getTabuleiropeça() {
		return tabuleiropeça;
	}

}
