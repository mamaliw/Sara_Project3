import Models.User;
import Utils.IO;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws Exception {

        Users users = new Users();
        users.currentUser = null;

        User user = new User("Mamal", "m.ranjbar", "m.ranjbar80@gmail.com", "mamal", "0023998611", "09906768372");

        //Test user
        users.users.add(user);


        while (true) {
            try {
                switch (IO.printFirstDialog()) {
                    case 1 -> {//sign up
                        users.addUser(IO.printSignUpDialog());
                    }
                    case 2 -> {//sign in
                        users.signIn(IO.printSignInDialog());
                    }



                    case 3 -> {//log all users
                        IO.print(users.getUsers().toString());
                    }
                    default -> {
                        IO.print("invalid");
                    }
                }
            }catch (Exception e){
                IO.print(e.toString());
            }

        }
    }
}
