package task5;
import java.util.stream.Stream;
public class ConvertString
{
    public static void main(String[] args) {
            // Create a stream of strings
            Stream<String> names = Stream.of("abc", "d", "ef");

            // Use map() to convert each string to uppercase
            Stream<String> upperCaseNames = names.map(String::toUpperCase);

            // Print each uppercase string
            upperCaseNames.forEach(System.out::println);
        }

}

//OUTPUT

//ABC
//D
//EF