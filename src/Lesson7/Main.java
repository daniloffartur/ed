package Lesson7;

public class Main {
    public static void main(String[] args) {

        Plate plate = new Plate(100);
        plate.addFood(50);

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Tom", 50);
        cats[1] = new Cat("Barsik", 150);
        cats[2] = new Cat("Marsik", 100);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }

        for (int i = 0; i < cats.length; i++) {
            cats[i].fullnessInfo();
        }
    }
}
