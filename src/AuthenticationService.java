import java.util.ArrayList;
import java.util.Iterator;

public class AuthenticationService implements IAuthenticationService {
    private ArrayList<User> users;

    // Constructor to initialize the users list with the default user
    public AuthenticationService() {

        users = new ArrayList<>();

        users.add(new User("name", "pass"));
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


    // logIn method to return the user if the username and password match, and null otherwise
    @Override
    public User logIn(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}

