import java.util.Arrays;

public class СentralPartOfTheMassif {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        int[] middle = getArrayMiddle(numbers);
        System.out.println(Arrays.toString(middle));
    }

    public static int[] getArrayMiddle(int[] numbers) {
        int middleIndex = numbers.length / 2;
        int[] middle;

        if (numbers.length % 2 == 0) {
            middle = new int[2];
            System.arraycopy(numbers, middleIndex - 1, middle, 0, 2);
        } else {
            middle = new int[1];
            middle[0] = numbers[middleIndex];
        }

        return middle;
    }
}