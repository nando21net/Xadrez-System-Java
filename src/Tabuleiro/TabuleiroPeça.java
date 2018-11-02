package Tabuleiro;

public class TabuleiroPe�a {
	
	private int linhas;
	private int colunas;
	private Pe�a[][] pe�as;
	public TabuleiroPe�a(int linhas, int colunas) {
		
		this.linhas = linhas;
		this.colunas = colunas;
		
		pe�as  = new Pe�a[linhas][colunas];
	}
	public int getLinhas() {
		return linhas;
	}
	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}
	public int getColunas() {
		return colunas;
	}
	public void setColunas(int colunas) {
		this.colunas = colunas;
	}

}
