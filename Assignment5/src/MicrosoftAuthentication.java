public class MicrosoftAuthentication extends AuthenticationStrategy
{
    private String outlook;
    private String code;

    public MicrosoftAuthentication(String outlook, String code) {
        this.outlook = outlook;
        this.code = code;
    }

    @Override
    public boolean authenticate()
    {
        authenticated = outlook.endsWith("@astanait.edu.kz") && code != null && !code.isBlank() && code.length() == 4;

        if(authenticated) {
            System.out.println("Microsoft login successful");
        } else {
            System.out.println("Microsoft login failed");
        }
        return authenticated;
    }
}