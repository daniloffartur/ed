package Lesson6;

public class Dog extends Animals {
    static int count;
    static final int MAX_DISTANCE_SWIM = 10;
    static final int MAX_DISTANCE_RUN = 500;

    public Dog(String name) {
        super(name);
        count += 1;
        maxDistanceSwim = MAX_DISTANCE_SWIM;
        maxDistanceRun = MAX_DISTANCE_RUN;
    }
}
