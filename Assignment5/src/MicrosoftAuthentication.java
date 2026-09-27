public class MicrosoftAuthentication implements AuthenticationStrategy{
    private String outlook;
    private String accessToken;

    public MicrosoftAuthentication(String outlook,
                                  String accessToken) {
        this.outlook = outlook;
        this.accessToken = accessToken;
    }

    @Override
    public boolean validateCredentials() {

        IO.println("Validating Microsoft account...");

        return outlook != null
                && !outlook.isBlank()
                && accessToken != null
                && accessToken.length() >= 8;
    }

    @Override
    public boolean checkToken(){
        IO.println("Checking Microsoft token...");

        return accessToken.startsWith("outlook");
    }

    @Override
    public boolean authenticate() {

        if (!validateCredentials()) {
            IO.println("Microsoft login failed.");
            return false;
        }
        if (!checkToken()){
            IO.println("Microsoft token is incorrect");
            return false;
        }

        IO.println("Microsoft login successful.");
        return true;
    }

    @Override
    public void logout() {
        if(!authenticate()){
            IO.println("Account do not authenticated.");
        }else{
            IO.println("Logged out from Microsoft account.");
        }
    }

}
