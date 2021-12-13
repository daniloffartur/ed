package Lesson6;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Tuzik");
        Dog dog2 = new Dog("Belka");
        Dog dog3 = new Dog("Strelka");

        Cat cat1 = new Cat("Barsik");
        Cat cat2 = new Cat("Marsik");

        dog1.run(300);
        dog2.swim(600);
        dog3.swim(5);

        cat1.run(200);
        cat2.swim(300);

        System.out.printf("Создано животных %d, кошек %d, собак %d", Animals.animalCount, Cat.count, Dog.count);
    }
}
