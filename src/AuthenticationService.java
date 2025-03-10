import java.util.ArrayList;

public class AuthenticationService implements IAuthenticationService {
    private ArrayList<User> users;

    // Constructor to initialize the users list with a default user
    public AuthenticationService() {
        users = new ArrayList<>();
        // You can add a default user to the list if needed
        User defaultUser = new User("defaultUsername", "defaultPassword");
        users.add(defaultUser);
    }

    // Implement the signUp method
    @Override
    public User signUp(String username, String password) {
        // Check if the username is already taken
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return null; // Username is already taken
            }
        }
        // Add the new user to the list and return the user
        User newUser = new User(username, password);
        users.add(newUser);
        return newUser;
    }

    // Implement the logIn method
    @Override
    public User logIn(String username, String password) {
        // Search for the user by username and check if the password matches
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user; // User found and logged in successfully
            }
        }
        return null; // Invalid credentials
    }
}
