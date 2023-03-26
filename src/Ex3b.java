import java.util.Arrays;

public class Ex3b {
    public void method3b() {
        int[][] arr = new int[10][10];
        int[] numbers = new int[10];
        for (int a = 0; a < numbers.length; a++) {
            numbers[a] = a + 1;
        }
        for (int i = 0, j = 0; i < arr.length && j < numbers.length; i++, j++) {
            {
                arr[0][i] = numbers[j];
                arr[1][i] = numbers[j] + 10;
                arr[2][i] = numbers[j] + 20;
                arr[3][i] = numbers[j] + 30;
                arr[4][i] = numbers[j] + 40;
                arr[5][i] = numbers[j] + 50;
                arr[6][i] = numbers[j] + 60;
                arr[7][i] = numbers[j] + 70;
                arr[8][i] = numbers[j] + 80;
                arr[9][i] = numbers[j] + 90;
            }
        }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] %2!=0) {
                        arr[i][j] = 999;
                    }
                }
            }
            for (int[] element : arr) {
                System.out.println(Arrays.toString(element).replace(",", "").replace("[", "").replace("]", ""));
            }
    }
}




