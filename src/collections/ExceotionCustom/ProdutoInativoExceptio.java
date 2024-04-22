package collections.ExceotionCustom;

public class ProdutoInativoExceptio extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ProdutoInativoExceptio(String message) {
		super(message);
	}
	
}
