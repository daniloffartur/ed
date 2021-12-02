package lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTac {

    private static final int SIZE = 5;
    public static int DOTS_TO_WIN = 3;

    private static final char DOT_EMPTY = '*';
    private static final char DOT_X     = 'X';
    private static final char DOT_O     = 'O';

    private static char[][] map;

    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    private static void humanTurn() {
        int x, y;

        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));

        map[y][x] = DOT_X;
    }

    public static void aiTurn() {

        if (!tryTurn(DOT_O)){
            if (!tryTurn(DOT_X)){
                int x, y;
                do {
                    x = rand.nextInt(SIZE);
                    y = rand.nextInt(SIZE);
                } while (!isCellValid(x, y));

                System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
                map[y][x] = DOT_O;
            }
        }
    }

    public static boolean tryTurn(char dot){
        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                if (isCellValid(y, x)){
                    map[x][y] = dot;
                    if (checkWin(dot)){
                        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
                        map[x][y] = DOT_O;
                        return true;
                    }else {
                        map[x][y] = DOT_EMPTY;
                    }
                }
            }
        }
        return false;
    }

    private static void initMap() {
        map = new char[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {

        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++){
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    public static boolean checkWin(char dot) {
        int sumX = 0;
        int sumY = 0;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {

                if (map[i][j] == dot) sumX++;
                else sumX = 0;
                if (sumX == DOTS_TO_WIN) return true;

                if (map[j][i] == dot) sumY++;
                else sumY = 0;
                if (sumY == DOTS_TO_WIN) return true;
            }
        }

        int sum1 = 0;
        int sum2 = 0;

        for (int k = DOTS_TO_WIN; k < SIZE; k++) {
            sumX = 0;
            sumY = 0;
            sum1 = 0;
            sum2 = 0;

            int j = 0;
            for (int i = SIZE - k; i < SIZE; i++) {

                if (map[i][j] == dot) sumX++;
                else sumX = 0;
                if (sumX == DOTS_TO_WIN) return true;

                if (map[j][i] == dot) sumY++;
                else sumY = 0;
                if (sumY == DOTS_TO_WIN) return true;

                if (map[j][SIZE - (i+1)] == dot) sum1++;
                else sum1 = 0;
                if (sum1 == DOTS_TO_WIN) return true;

                if (map[SIZE-(j+1)][i] == dot) sum2++;
                else sum2 = 0;
                if (sum2 == DOTS_TO_WIN) return true;

                j++;
            }
        }

        sumX = 0;
        sumY = 0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == dot) sumX++;
            else sumX = 0;
            if (sumX == DOTS_TO_WIN) return true;

            if (map[i][SIZE - (i+1)] == dot) sumY++;
            else sumY = 0;
            if (sumY == DOTS_TO_WIN) return true;
        }
        return false;
    }

}
