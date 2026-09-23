public interface AuthenticationStrategy {

    boolean validateCredentials();

    boolean authenticate();

    void logout();
}