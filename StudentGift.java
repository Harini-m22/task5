package task5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentGift {
    public static void main(String[] args) {
        // List to store student names
        List<String> students = new ArrayList<>();
        students.add("Alice");
        students.add("Bob");
        students.add("Anna");
        students.add("John");
        students.add("Aria");
        students.add("David");
        students.add("Albert");
        students.add("Steve");
        students.add("Ava");
        students.add("Mark");

        // Using Stream and lambda to filter students whose names start with "A"
        List<String> studentsWithA = students.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        // Output the filtered students
        System.out.println("Students receiving special gifts: " + studentsWithA);
    }
}
//OUTPUT
//Students receiving special gifts: [Alice, Anna, Aria, Albert, Ava]