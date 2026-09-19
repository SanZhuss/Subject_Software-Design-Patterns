package factoryPattern;

public abstract class NotificationCreator {
    public abstract Notification createNotification(String message, String recipient, String contact);
}
