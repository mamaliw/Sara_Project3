package Models;

public class User {

//    enum Role {
//        LOW,
//        MEDIUM,
//        HIGH
//    }

    private String name;
    private String username;
    private String email;
    private String password;
    private String nationalCode;
    private String phoneNumber;

    public User(String name, String username, String email, String password, String nationalCode, String phoneNumber) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
        this.nationalCode = nationalCode;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "\nModels.User{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", nationalCode='" + nationalCode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }


}
