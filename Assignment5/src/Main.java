import java.util.HashMap;
import java.util.Map;

public class Main {

    static void main(String[] args) {
        authentication("user@gmail.com", "gogle123token");
        authentication("user@gmail.com", "google123token");

        authentication("john_smith", "facebok123token");
        authentication("john_smith", "facebook123token");

        authentication("251355@astanait.edu.kz", "outlok123token");
        authentication("251355@astanait.edu.kz", "outlook123token");
    }

    static void authentication(String mailOrName, String token){
        AuthenticationContext context = new AuthenticationContext();

        if(mailOrName.endsWith("@gmail.com")) {
            context.setStrategy(new GoogleAuthentication(mailOrName, token));
        } else if (mailOrName.startsWith("@astanait.edu.kz")){
            context.setStrategy(new MicrosoftAuthentication(mailOrName, token));
        } else {
            context.setStrategy(new FacebookAuthentication(mailOrName, token));
        }

        context.login();

        context.logout();

        System.out.println();
    }

}