package Lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    public void eat(Plate p) {
        if (!fullness && p.decreaseFood(appetite)) fullness = true;
    }

    public void fullnessInfo(){
        System.out.println(name + (fullness ? " сыт" : " голоден"));
    }
}
