import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};

        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers)+"\n");


        int[] numbers2 = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
        int [] numbersCopy2 = new int[10];

        for (int i = 0; i < numbers2.length; i++) {
            numbersCopy2[i] = numbers2[i];
        }
        System.out.println("numbers2: "+Arrays.toString(numbers2));
        System.out.println("numbersCopy2: "+Arrays.toString(numbersCopy2)+"\n");


        int[] numbers3 = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
        Arrays.sort(numbers3);
        System.out.println("method sort(): "+Arrays.toString(numbers3)+"\n");

        int[] numbers4 = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
        int [] numbersCopy4 = Arrays.copyOf(numbers4, numbers4.length);
        System.out.println("method copyOf(): "+Arrays.toString(numbersCopy4)+"\n");

        int[] numbers5 = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
        int [] numbersCopy5 = Arrays.copyOf(numbers5, 4);
        System.out.println("method copyOf(): "+Arrays.toString(numbersCopy5)+"\n");

        int[] numbers6 = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
        int [] numbersCopy6 = Arrays.copyOfRange(numbers6, 2,6);
        System.out.println("method copyOfRange(): "+Arrays.toString(numbersCopy6)+"\n");

        int[] numbers7 = {1, 2, 3};
        int[] numbers8 = {1, 2, 3};
        System.out.println("method equals(): "+Arrays.equals(numbers7, numbers8)+"\n");

        int[][] numbers9 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] numbersCopy9 = Arrays.copyOf(numbers9, numbers9.length);

        System.out.println("method deepEquals(): "+Arrays.deepEquals(numbers9, numbersCopy9));
        System.out.println("method deepToString(): "+Arrays.deepToString(numbersCopy9));
    }
}