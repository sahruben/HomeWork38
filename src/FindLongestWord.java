import java.util.Arrays;
import java.util.Comparator;

public class FindLongestWord {

    public static void main(String[] args) {
        String[] words = {"Hello", "World", "This is a long word", "This is a short word"};

        String longestWord = Arrays.stream(words)
                .max(Comparator.comparing(String::length))
                .get();

        System.out.println(" " + longestWord);
    }
}

