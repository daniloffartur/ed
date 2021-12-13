package Lesson6;

public class Animals {
    String name;
    int maxDistanceSwim;
    int maxDistanceRun;

    static int animalCount;

    public Animals(String name) {
        this.name = name;
        animalCount += 1;
    }

    public void swim(int distance){
        if (maxDistanceSwim == 0){
            System.out.println(name + " не умеет плавать");
        }else if (maxDistanceSwim > distance){
            System.out.println(name + ": \"Слишком сложно!\"");
        }else {
            System.out.printf("%s проплыл %d м\n", name, distance);
        }
    }

    public void run(int distance){
        if (maxDistanceRun == 0){
            System.out.println(name + " не умеет бегать");
        }else if (maxDistanceRun > distance){
            System.out.println(name + ": \"Слишком сложно!\"");
        }else {
            System.out.printf("%s пробежал %d м\n", name, distance);
        }
    }
}
