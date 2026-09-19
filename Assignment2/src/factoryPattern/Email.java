package factoryPattern;

public class Email extends Notification{
    private String email;

    public Email(String message, String recipient, String email){
        super(message, recipient);
        this.email = email;
    }

    @Override
    public void send(){
        IO.println("|--------------------------------------|");
        IO.println("Email message referred to " + recipient + "\n" + message + "\nRecipient's email" + " (" + email + ")");
    }
}
