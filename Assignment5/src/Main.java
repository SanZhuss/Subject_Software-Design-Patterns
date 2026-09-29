import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        IO.println("Authentication Type:\n1. Google\n2. Facebook\n3. Microsoft\n");
        authentication("user@gmail.com", "google123token", 1);
        authentication("user@gmal.com", "google123token", 1);

        authentication("john_smith", "facebok123", 2);
        authentication("john_smith", "faceboo", 2);

        authentication("251355@astanait.edu.kz", "2567", 3);
        authentication("251355@astanait.edu.kz", "254", 3);
    }

    static void authentication(String contact, String token, int authenticationType){
        Map<Integer, AuthenticationStrategy> strategies = new HashMap<>();

        strategies.put(1, new GoogleAuthentication(contact, token));
        strategies.put(2, new FacebookAuthentication(contact, token));
        strategies.put(3, new MicrosoftAuthentication(contact, token));

        AuthenticationContext context = new AuthenticationContext(strategies.get(authenticationType));

        context.login();
        context.logout();
        IO.println();
    }

}