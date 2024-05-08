package collections.ExceptionCustom;

public class ProdutoSemEstoqueException extends ProdutoException{

	private static final long serialVersionUID = 1L;

	private final int estoqueDisponivel;
	private final int estoqueNecessaro;
	
	public ProdutoSemEstoqueException(String message, int estoqueDisponivel, int estoqueNecessaro) {
		super(message);
		this.estoqueDisponivel = estoqueDisponivel;
		this.estoqueNecessaro = estoqueNecessaro;
	}

	public int getEstoqueDisponivel() {
		return estoqueDisponivel;
	}

	public int getEstoqueNecessaro() {
		return estoqueNecessaro;
	}

	

}
