import java.util.Arrays;

public class Ex3c {
    public void method3c(){
        int[][] arr = new int[10][11];
        int[] numbers = new int[10];
        for (int a = 0; a < numbers.length; a++) {
            numbers[a] = a + 1;
        }
        for (int i = 0, j = 0; i < arr.length && j < numbers.length; i++, j++){
            arr[0][i] = numbers[j];
            arr[1][i] = numbers[j]+10;
            arr[2][i] = numbers[j]+20;
            arr[3][i] = numbers[j]+30;
            arr[4][i] = numbers[j]+40;
            arr[5][i] = numbers[j]+50;
            arr[6][i] = numbers[j]+60;
            arr[7][i] = numbers[j]+70;
            arr[8][i] = numbers[j]+80;
            arr[9][i] = numbers[j]+90;
        }
        //create an array of size array.length
        int[] result = new int[arr.length];
        int sumRow;
        int rows = arr.length;
        int columns = arr[0].length;

        //Loop over the first dimension
        for (int i = 0; i < rows; i++) {

            sumRow = 0;//Make sure to re-initialize the total in each iteration

            //For each row calculate the sum and store it in total
            for (int j = 0; j < columns; j++) {
                sumRow += arr[i][j];
            }
            //When you finish put the result of each row in result[i]
            result[i] = sumRow;
            arr[i][10] = result[i];
        }
        for (int[] element : arr) {
            System.out.println(Arrays.toString(element).replace(",", "").replace("[", "").replace("]", ""));
        }
    }
}
