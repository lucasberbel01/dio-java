public class SenhaInvalidaException extends RuntimeException{

    public SenhaInvalidaException(){}


    public SenhaInvalidaException(String msg){
        super(msg);
    }

    public SenhaInvalidaException(Throwable cause){
        super(cause);
    }

    public SenhaInvalidaException(String msg, Throwable cause){
        super(msg,cause);
    }
}
