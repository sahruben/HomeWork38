import java.util.Arrays;

public class SumOfSquares {

    public static void main(String[] args) {
        int[] numbers = {5, 7, 3, 9, 12};

        int sumOfSquares = Arrays.stream(numbers)
                .map(x -> x * x)
                .sum();

        System.out.println(" " + sumOfSquares);
    }
}


