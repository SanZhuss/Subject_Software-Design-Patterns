package factoryPattern;

public class SMS extends Notification{
    private String phoneNumber;

    public SMS(String message, String recipient, String phoneNumber){
        super(message, recipient);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send(){
        IO.println("|--------------------------------------|");
        IO.println("SMS referred to " + recipient + "\n" + message + "\nRecipient's phone number" + " (" + phoneNumber + ")");
    }
}
