package exceptions.pratica1;

public class OperacaoBancariaException extends RuntimeException  {

	private static final long serialVersionUID = 1L;

	public OperacaoBancariaException(String message) {
        super(message);
    }

    public OperacaoBancariaException(String message, Throwable cause) {
        super(message, cause);
    }

	
}
