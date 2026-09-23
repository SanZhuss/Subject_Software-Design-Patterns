import java.util.HashMap;
import java.util.Map;

public class Main {

    static void main(String[] args) {
        authentication("user@gmail.com", "google123token");

        authentication("john_smith", "facebook123token");
    }

    static void authentication(String mailOrName, String token){
        AuthenticationContext context = new AuthenticationContext();

        if(token.startsWith("google")){
            context.setStrategy(new GoogleAuthentication(mailOrName, token));
        } else if (token.startsWith("facebook")) {
            context.setStrategy(new FacebookAuthentication(mailOrName, token));
        } else{
            IO.println("Failed to authenticate!");
        }

        context.login();

        System.out.println();
    }

}