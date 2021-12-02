package lesson3;

import java.util.Arrays;

public class HomeWorkApp3 {

    public static void main(String[] args) {

        { // 1
            int[] arr = {0, 1, 0, 0, 1, 1, 0, 1};

            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] == 0 ? 1 : 0;
            }
        }

        { // 2
            int[] arr = new int[100];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = i + 1;
            }
        }

        { // 3
            int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 6)
                    arr[i] = arr[i] * 2;
            }
        }

        { // 4
            int[][] arr = new int[5][5];

            for (int i = 0; i < arr.length; i++){
                arr[i][i] = 1;
                arr[i][arr.length - i - 1] = 1;
            }
        }

        { // 5
            int[] arr = getArr(5, 3);
        }

        { // 6
            int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < arr.length; i++){
                min = arr[i] < min ? arr[i] : min;
                max = arr[i] > max ? arr[i] : max;
            }

            if (arr.length > 0)
                System.out.printf("Минимальное значение - %d, максимальное значение - %d\n", min, max);
            else
                System.out.println("Массив пуст");
        }

        { // 7
            int[] arr1 = {2, 2, 2, 1, 2, 2, 10, 1};
            boolean a = checkBalance(arr1);

            int[] arr2 = {1, 1, 1, 2, 1};
            boolean b = checkBalance(arr2);

            int[] arr3 = {1, 1, 1, 2, 3};
            boolean c = checkBalance(arr3);
        }

        { // 8
            int[] arr = {1, 2, 3, 4, 5};
            shiftItems(arr, -3);
        }
    }

    private static void shiftItems(int[] arr, int n) {
        int step = n > 0 ? 1 : -1;
        int currentItem = 0;
        int nextItem = 0;

        for (; n != 0; n -= step){
            for (int i = 0; i < arr.length; i++) {
                int nextIndex = step == -1 ? arr.length - 1 - i : i + step;

                if (nextIndex < 0) nextIndex = arr.length - 1;
                else if (nextIndex > arr.length - 1) nextIndex = 0;

                nextItem = arr[nextIndex];
                arr[nextIndex] = i == 0 ? arr[i] : currentItem;
                currentItem = nextItem;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static boolean checkBalance(int[] arr) {
        int sum1 = 0;
        int sum2 = 0;

        int i = 0;
        int j = arr.length;

        if (j < 2) return false;

        while (i < j){
            if (sum1 > sum2) sum2 += arr[--j];
            else sum1 += arr[i++];
        }

        return sum1 == sum2;
    }

    private static int[] getArr(int len, int initialValue){
        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }

        return arr;
    }

}
