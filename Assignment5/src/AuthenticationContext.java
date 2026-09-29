public class AuthenticationContext
{
    private AuthenticationStrategy strategy;

    public AuthenticationContext(AuthenticationStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(AuthenticationStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean login() {
        return strategy.authenticate();
    }

    public void logout() {
        strategy.logout();
    }
}