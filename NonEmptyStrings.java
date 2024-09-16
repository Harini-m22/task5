package task5;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonEmptyStrings {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        // Using Stream to filter non-empty strings
        List<String> nonEmptyStrings = listOfStrings.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        // Print the list of non-empty strings
        System.out.println("List of non-empty strings: " + nonEmptyStrings);
    }
}

//OUTPUT
//List of non-empty strings: [abc, bc, efg, abcd, jkl]
