package Tabuleiro;

public class Pe�a {
	
	// para n�o exibir mn regra de noegocio minha posicao de matriz referente a posicao da pe�a
	
	protected Posicao posicao;
	private TabuleiroPe�a tabuleirope�a;
	
	//crie apenas  using Fields para Pe�a.. Todavia subtendi que a pe�a n�o esta posicionada ainda no tabuleiro
	
	public Pe�a(TabuleiroPe�a tabuleirope�a) {
	
		this.tabuleirope�a = tabuleirope�a;
		posicao = null;
	}

	// Acessivel apenas pela camada Tabuleiro usar "peotected"
	protected TabuleiroPe�a getTabuleirope�a() {
		return tabuleirope�a;
	}

}
