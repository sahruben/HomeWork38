import java.util.Arrays;

public class FindMaxNumber {

    public static void main(String[] args) {
        int[] numbers = {3, 26, 44, 5, 7};

        int maxNumber = Arrays.stream(numbers)
                .max()
                .getAsInt();

        System.out.println(" " + maxNumber);
    }
}

