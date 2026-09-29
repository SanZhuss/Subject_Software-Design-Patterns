public abstract class AuthenticationStrategy
{
    protected boolean authenticated;

    public abstract boolean authenticate();

    public void logout()
    {
        if(authenticated)
        {
            authenticated = false;
            System.out.println("Logout successful");
        }
        else
        {
            System.out.println("User already logged out");
        }
    }
}