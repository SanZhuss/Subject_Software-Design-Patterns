public class GoogleAuthentication implements AuthenticationStrategy {

    private String gmail;
    private String oauthToken;

    public GoogleAuthentication(String gmail, String oauthToken) {
        this.gmail = gmail;
        this.oauthToken = oauthToken;
    }

    @Override
    public boolean validateCredentials() {

        System.out.println("Validating Google account...");

        return gmail != null
                && gmail.endsWith("@gmail.com")
                && oauthToken != null
                && oauthToken.length() >= 8;
    }

    @Override
    public boolean authenticate() {

        if (!validateCredentials()) {
            System.out.println("Google login failed.");
            return false;
        }

        System.out.println("Google login successful.");
        return true;
    }

    @Override
    public void logout() {
        System.out.println("Logged out from Google account.");
    }
}