package factoryPattern;

abstract class Notification {
    protected String message;
    protected String recipient;

    public Notification(String message, String recipient) {
        this.message = message;
        this.recipient = recipient;
    }

    public abstract void send();

    public String getRecipient() {
        return recipient;
    }

    public String getMessage() {
        return message;
    }
}
