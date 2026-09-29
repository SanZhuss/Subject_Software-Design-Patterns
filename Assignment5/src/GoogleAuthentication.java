public class GoogleAuthentication extends AuthenticationStrategy
{
    private String gmail;
    private String oauthToken;

    public GoogleAuthentication( String gmail, String oauthToken) {
        this.gmail = gmail;
        this.oauthToken = oauthToken;
    }

    @Override
    public boolean authenticate()
    {
        authenticated = gmail.endsWith("@gmail.com") && oauthToken != null && !oauthToken.isBlank();
        if(authenticated) {
            System.out.println("Google login successful");
        } else {
            System.out.println("Google login failed");
        }
        return authenticated;
    }
}