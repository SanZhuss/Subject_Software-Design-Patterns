public class FacebookAuthentication extends AuthenticationStrategy
{
    private String username;
    private String password;

    public FacebookAuthentication( String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean authenticate()
    {
        authenticated = username != null && !username.isBlank() && password != null && password.length() >= 6;
        if(authenticated)
        {
            System.out.println("Facebook login successful");
        } else {
            System.out.println("Facebook login failed");
        }
        return authenticated;
    }
}