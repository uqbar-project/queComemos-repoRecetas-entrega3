package queComemos.entrega3.excepciones;

@SuppressWarnings("serial")
public class BusinessException extends RuntimeException {

	public BusinessException(String msg) {
		super(msg);
	}
	
}
