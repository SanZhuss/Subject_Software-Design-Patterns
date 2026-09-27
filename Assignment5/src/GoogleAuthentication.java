public class GoogleAuthentication implements AuthenticationStrategy {

    private String gmail;
    private String oauthToken;

    public GoogleAuthentication(String gmail, String oauthToken) {
        this.gmail = gmail;
        this.oauthToken = oauthToken;
    }

    @Override
    public boolean validateCredentials() {

        IO.println("Validating Google account...");

        return gmail != null
                && gmail.endsWith("@gmail.com")
                && oauthToken != null
                && oauthToken.length() >= 8;
    }

    @Override
    public boolean checkToken(){
        IO.println("Checking Google oath token...");

        return oauthToken.startsWith("google");
    }

    @Override
    public boolean authenticate() {

        if (!validateCredentials()) {
            System.out.println("Google login failed.");
            return false;
        }
        if (!checkToken()){
            IO.println("Google oath token is incorrect");
            return false;
        }

        IO.println("Google login successful.");
        return true;
    }

    @Override
    public void logout() {
        if(!authenticate()){
            IO.println("Account do not authenticated.");
        }else{
            IO.println("Logged out from Google account.");
        }
    }
}