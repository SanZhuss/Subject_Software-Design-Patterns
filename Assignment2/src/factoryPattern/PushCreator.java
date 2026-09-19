package factoryPattern;

public class PushCreator extends NotificationCreator{
    @Override
    public Notification createNotification(String message, String recipient, String deviceId) {
        return new Push(
                message,
                recipient,
                deviceId
        );
    }
}
