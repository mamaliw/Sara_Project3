package Models;

import java.util.Date;

public class Question {

    enum Difficulty {
        OPEN,
        IN_TEST
    }

    enum Type {
        TEST,
        FILL_BLANKS,
        SHORT_ANSWER,
        LONG_ANSWER
    }

    public String name;
    public Float score;
    public String question;
    public Difficulty difficulty;
    public Type delayedEnd;
    
}
