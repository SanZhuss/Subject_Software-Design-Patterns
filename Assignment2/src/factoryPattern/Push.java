package factoryPattern;

public class Push extends Notification{
    private String deviceId;

    public Push(String message, String recipient, String deviceId){
        super(message, recipient);
        this.deviceId = deviceId;
    }

    @Override
    public void send(){
        IO.println("|--------------------------------------|");
        IO.println("Push notification referred to " + recipient + "\n" + message + "\nRecipient's device" + " (" + deviceId + ")");
    }
}
