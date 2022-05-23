import Models.User;
import Utils.IO;


public class Main {
    public static void main(String[] args) throws Exception {

        Users users = new Users();

        User user = new User("Mamal", "m.ranjbar", "m.ranjbar80@gmail.com", "Mohamad", "0023998611", "09906768372");
        User user2 = new User("Mamal", "m.ranjbar", "m.ranjbar80@gmail.com", "Mohamad", "0023998611", "09906768372");

        users.addUser(user);
//        users.addUser(user2);

//        IO.print(users.getUsers().toString());

//        Integer input = ;
//        IO.print(input.toString());

        while (true) {
            try {
                switch (IO.printFirstDialog()) {
                    case 1 -> {//sign up
                        users.addUser(IO.printSignUpDialog());
                    }
                    case 2 -> {//sign in
                        IO.print("in");
                    }

                    case 3 -> {//sign in
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
