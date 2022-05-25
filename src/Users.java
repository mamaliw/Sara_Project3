import Models.User;
import Utils.IO;

import java.util.ArrayList;

public class Users {
    public ArrayList<User> users;
    public User currentUser;

    public Users() {
        users = new ArrayList<User>();
    }


    public ArrayList<User> getUsers(){
        return users;
    }

    public void addUser(ArrayList<String> userParameters) throws Exception {
        User user = new User(userParameters.get(0), userParameters.get(1), userParameters.get(2), userParameters.get(3), userParameters.get(4), userParameters.get(5));

        //To aware username duplication
        User testUser = users.stream().filter( user1 -> user.getUsername().equals(user1.getUsername())).findAny().orElse(null);

        if (testUser != null){
            throw new Exception("Username Already Taken.");
        }

        users.add(user);
        currentUser = user;
    }

    public void signIn(ArrayList<String> userParameters) throws Exception {
        User user = users.stream().filter( user1 -> userParameters.get(0).equals(user1.getUsername()) && userParameters.get(1).equals(user1.getPassword())).findAny().orElse(null);

        if (user == null){
            throw new Exception("Invalid Credentials.");
        }

        IO.print("Logged In");

        currentUser = user;
    }
}
