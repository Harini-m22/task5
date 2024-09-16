package task5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their birthdate in yyyy-mm-dd format
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String birthdateInput = scanner.nextLine();

        // Parse the input to LocalDate
        LocalDate birthdate = LocalDate.parse(birthdateInput);

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the period between the birthdate and the current date
        Period age = Period.between(birthdate, currentDate);

        // Display the result
        System.out.printf("Your age is: %d years, %d months, and %d days.%n",
                age.getYears(), age.getMonths(), age.getDays());

        // Close the scanner
        scanner.close();
    }
}

//OUTPUT
//Enter your birthdate (yyyy-mm-dd): 2000-09-22
//Your age is: 23 years, 11 months, and 25 days.
