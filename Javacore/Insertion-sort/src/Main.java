import java.util.Arrays;

public class Main {
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            for (; j >= 0 && array[j] > temp; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = temp;
        }
        System.out.println(Arrays.toString(array) + " " + "insertSort");
    }

    public static void main(String [] args) {
        int[] arr = new int[]{1, 2, 3, 4, 8, 4, 6, 2, 9, 0, 10};
        insertSort(arr);


    }
}

