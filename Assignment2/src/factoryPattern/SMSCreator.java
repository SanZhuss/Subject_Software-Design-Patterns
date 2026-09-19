package factoryPattern;

public class SMSCreator extends NotificationCreator{
    @Override
    public Notification createNotification(String message, String recipient, String phoneNumber) {
        return new SMS(
                message,
                recipient,
                phoneNumber
        );
    }
}
