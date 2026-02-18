public class IdadeNegativaException extends RuntimeException{
    /*
    RunTimeException é para erros externos como inputs de usuarios
    respostas de api externa.
    resumidamente: erro no uso do codigo

    exception é para erro de execucao do ambiente
    erro no servidor, banco de dados
    algo que o servidor consiga resolver sozinho sem ajuda externa
     */

    public IdadeNegativaException(){} //construtores cheios e vazios para personalizar a mensagem

    public IdadeNegativaException(String message) {
        super(message);
    }

    public IdadeNegativaException(Throwable cause){ //construtor que recebe outra exception
        super(cause);
    }

    public IdadeNegativaException(String message, Throwable cause){
        super(message,cause);

    }
}
