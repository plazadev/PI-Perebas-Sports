package pi.Erros;


public class ErrosBD extends Exception{
    public ErrosBD(String message) {
        super(message);
    }
    public ErrosBD(String message, Throwable cause) {
        super(message, cause);
    }

    public ErrosBD(Throwable cause) {
        super(cause);
    }
    
}
