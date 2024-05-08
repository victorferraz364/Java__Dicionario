package exceptions.pratica1;

public class ContaInativaException extends OperacaoBancariaException{

	private static final long serialVersionUID = 1L;

	public ContaInativaException(String message) {
        super(message);
    }

    public ContaInativaException(String message, Throwable cause) {
        super(message, cause);
    }
	
}
