package factoryPattern;

public class EmailCreator extends NotificationCreator{
    @Override
    public Notification createNotification(String message, String recipient, String email) {
        return new Email(
                message,
                recipient,
                email
        );
    }
}
