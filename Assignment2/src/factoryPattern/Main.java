package factoryPattern;

public class Main {
    private static void sendNotification(
            NotificationCreator creator,
            String message,
            String recipient,
            String destination) {

        Notification notification =
                creator.createNotification(
                        message,
                        recipient,
                        destination
                );

        notification.send();
    }

    public static void main(String[] args) {

        sendNotification(
                new EmailCreator(),
                "Welcome!",
                "John",
                "john@gmail.com"
        );

        sendNotification(
                new PushCreator(),
                "New achievement unlocked!",
                "Alex",
                "DEVICE-001"
        );

        sendNotification(
                new SMSCreator(),
                "Alert! Tomorrow will be rainy.",
                "Patrick",
                "+7 708 998 70 89"
        );
    }
}
