package lesson2;

public class HomeWorkApp2 {

    public static void main(String[] args) {
        sumNumCompare(5, 11);
        printSingOfNum(5);
        isNegativeNum( -5);
        printText("Hello, world", 3);
        isLeapYear(2021);
    }

    private static boolean sumNumCompare(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    private static void printSingOfNum(int a){
        if(a < 0) {
            System.out.println("Число отрицательноe");
        } else {
            System.out.println("Число положительное");
        }
    }

    private static boolean isNegativeNum(int a){
        return a < 0;
    }

    private static void printText(String text, int a){
        for(int i = 0; i < a; i++){
            System.out.println(text);
        }
    }

    private static boolean isLeapYear(int y){
        boolean b = false;

        if(y < 0) y *= -1;

        if(y % 400 == 0){
            b = true;
        } else if (y % 100 == 0){
            b = false;
        } else if (y % 4 == 0){
            b = true;
        }

        return b;
    }

}
