import java.util.Arrays;

public class PrintLongStrings {

    public static void main(String[] args) {
        String[] strings = {"Хороший", "Человек","This is a long string", "This is a short string"};

        Arrays.stream(strings)
                .filter(s -> s.length() > 7)
                .forEach(System.out::println);
    }
}


