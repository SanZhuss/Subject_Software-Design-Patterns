public class AuthenticationContext {

    private AuthenticationStrategy strategy;

    public void setStrategy(AuthenticationStrategy strategy) {
        this.strategy = strategy;
    }

    public void login() {
        strategy.authenticate();
    }

    public void logout() {
        strategy.logout();
    }
}