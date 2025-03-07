import java.util.ArrayList;
import java.util.Iterator;

public class AuthenticationService implements IAuthenticationService {
    private ArrayList<User> users;

    // Constructor to initialize the users list with the default user
    public AuthenticationService() {
        users.add(new User("test", "test"));
    }

    // signUp method to add a new user to the list if the username is not taken and return the user; returns null otherwise
    @Override
    public User signUp(String username, String password) {
        for (User existAlready : users) {
            if (existAlready.getUsername().equals(username)) {
                return null;
            }
        }
        User newUser = new User(username, password);
        users.add(newUser);
        return newUser;
    }

    // TODO Now: Implement the logIn method to return the user if the username and password match, and null otherwise
    @Override
    public User logIn(String username, String password) {

        return null;
    }
}

