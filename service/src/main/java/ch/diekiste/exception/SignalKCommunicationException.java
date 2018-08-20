package ch.diekiste.exception;

public class SignalKCommunicationException extends ServiceException {

    public SignalKCommunicationException(String message, Exception e) {
        super(message, e);
    }
}
