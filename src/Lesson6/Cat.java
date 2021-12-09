package Lesson6;

public class Cat extends Animals {
    static int count;
    static final int MAX_DISTANCE_SWIM = 0;
    static final int MAX_DISTANCE_RUN = 200;

    public Cat(String name) {
        super(name);
        count += 1;
        maxDistanceSwim = MAX_DISTANCE_SWIM;
        maxDistanceRun = MAX_DISTANCE_RUN;
    }
}
