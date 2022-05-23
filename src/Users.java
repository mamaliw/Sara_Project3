import Models.User;

import java.util.ArrayList;

public class Users {
    public ArrayList<User> users;

    public Users() {
        this.users = new ArrayList<>();
    }


    public ArrayList<User> getUsers(){
        return this.users;
    }

    public ArrayList<User> addUser(User user) throws Exception {
        //To aware username duplication
        User testUser = this.users.stream().filter( user1 -> user.getUsername().equals(user1.getUsername())).findAny().orElse(null);

        if (testUser != null){
            throw new Exception("Username Already Taken.");
        }

        this.users.add(user);
        return this.users;
    }
}
