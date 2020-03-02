package user_exception.ex.exceptions;

public class StupidUserException extends Exception {
    private String uncorrectedProperty;

    public StupidUserException(String uncorrectedProperty) {
        super();
        this.uncorrectedProperty = uncorrectedProperty;
    }

    public StupidUserException(String uncorrectedProperty, String message) {
        super(message);
        this.uncorrectedProperty = uncorrectedProperty;
    }

    public StupidUserException(String message, Throwable cause) {
        super(message, cause);
    }

    public StupidUserException(Throwable cause) {
        super(cause);
    }

    protected StupidUserException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public String getUncorrectedProperty() {
        return uncorrectedProperty;
    }

    public void setUncorrectedProperty(String uncorrectedProperty) {
        this.uncorrectedProperty = uncorrectedProperty;
    }
}