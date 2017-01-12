package facin.extensao.jpa1.negocio;

public class DAOAutorException extends Exception {
	public DAOAutorException(){
		super();
	}
	public DAOAutorException(String mensagem) {
		super(mensagem);
	}
	public DAOAutorException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}
