public class Main {
    public static void main(String[] args) {
        int[] array = {1, 23, 3, 4, 5, 6, 7, 8};
        int index = minvalue(array);
        System.out.println("The smallest element in the array is: " + array[index]);
        System.out.println("index :" + index);
    }

    public static int minvalue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;

    }

}
