public class FacebookAuthentication implements AuthenticationStrategy {

    private String username;
    private String accessToken;

    public FacebookAuthentication(String username,
                                  String accessToken) {
        this.username = username;
        this.accessToken = accessToken;
    }

    @Override
    public boolean validateCredentials() {

        System.out.println("Validating Facebook account...");

        return username != null
                && !username.isBlank()
                && accessToken != null
                && accessToken.length() >= 8;
    }

    @Override
    public boolean authenticate() {

        if (!validateCredentials()) {
            System.out.println("Facebook login failed.");
            return false;
        }

        System.out.println("Facebook login successful.");
        return true;
    }

    @Override
    public void logout() {
        System.out.println("Logged out from Facebook account.");
    }
}