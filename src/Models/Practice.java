package Models;

import java.util.Date;

public class Practice {

    enum Status {
        OPEN,
        IN_TEST
    }

    public String name;
    public String description;
    public Date start;
    public Date end;
    public Status status;
    public Date delayedEnd;
    public Float delayedMultiplier;

}
