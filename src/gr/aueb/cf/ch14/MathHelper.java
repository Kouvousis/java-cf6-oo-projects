package gr.aueb.cf.ch14;

public class MathHelper {

    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findAverage(int[] arr) {
        int sum = 0;
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        for (int i= 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
