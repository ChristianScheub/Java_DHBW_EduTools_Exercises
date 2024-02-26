public class ExceptionCaught extends Exception {
    public ExceptionCaught(String message) {
        super(message);
    }
    public ExceptionCaught(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionCaught() {
        super();
    }
}
