public interface AuthenticationStrategy {

    boolean validateCredentials();

    boolean checkToken();

    boolean authenticate();

    void logout();
}