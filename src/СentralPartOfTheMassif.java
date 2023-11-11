import java.util.Arrays;

public class СentralPartOfTheMassif {
    public static void main(String[] args) {
        int[] a = {14, 16, 3};

        getArrayMiddle(a);
        System.out.println(Arrays.toString(getArrayMiddle(a)));
    }

    public static int[] getArrayMiddle(int[] numbers) {
        if (numbers.length > 2) {
            if (numbers.length % 2 == 0) {
                int[] arr = new int[2];
                arr[0] = numbers[numbers.length / 2 - 1];
                arr[1] = numbers[numbers.length / 2];
                return arr;
            } else {
                int[] arr1 = new int[1];
                arr1[0] = numbers[numbers.length / 2];
                return arr1;
            }
        } else {
            return numbers;
        }
    }
}