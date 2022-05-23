package Models;

import java.util.Date;

public class Class {

    enum Status {
        OPEN,
        CLOSED
    }

    public String name;
    public String instituteName;
    public String professorName;
    public Date year;
    public Status registrationStatus;
    public Boolean isPrivate;
    public String password;
    public String description;
    public User owner;
}
