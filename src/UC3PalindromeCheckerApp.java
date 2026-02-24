import java.util.*;

public class UC3PalindromeCheckerApp {
    public static void main(String[] args){
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version: 1.0");
        System.out.println("System initialized successfully.");

        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter String to check: ");
        String str = input.next();

        String reversed = "";

        // Iterate from last character to first
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        // Compare original and reversed strings
        if (str.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        input.close();
    }
}