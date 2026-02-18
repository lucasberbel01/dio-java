public class TipoDeUsuarioInvalidoException extends RuntimeException{

    public TipoDeUsuarioInvalidoException(){}


    public TipoDeUsuarioInvalidoException(String msg){
        super(msg);
    }

    public TipoDeUsuarioInvalidoException(Throwable cause){
        super(cause);
    }

    public TipoDeUsuarioInvalidoException(String msg, Throwable cause){
        super(msg,cause);
    }
}
