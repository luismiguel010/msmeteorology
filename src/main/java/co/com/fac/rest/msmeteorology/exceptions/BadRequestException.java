package co.com.fac.rest.msmeteorology.exceptions;

public class BadRequestException extends Exception {
    private int errorCode;

    public BadRequestException(String msg) {
        super(msg);
        setErrorCode();
    }

    private void setErrorCode() {
        this.errorCode = 400;
    }
}
