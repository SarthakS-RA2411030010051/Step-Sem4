/**
 *
 * MAIN CLASS - PalindromeCheckerApp
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * This class demonstrates how different palindrome
 * validation algorithms can be selected dynamically
 * at runtime using the Strategy Design Pattern.
 *
 * At this stage, the application:
 * - Defines a common PalindromeStrategy interface
 * - Implements a concrete Stack-based strategy
 * - Injects the strategy at runtime
 * - Executes the selected algorithm
 *
 * No performance comparison is done in this use case.
 * The focus is purely on algorithm interchangeability.
 *
 * @author Sarthak Srivastava
 * @version 12.0
 */

public class UC12PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "Level";

        // Strategy injection
        PalindromeStrategy strategy = new StackStrategy();

        // Execute selected strategy
        boolean result = strategy.check(input.toLowerCase());

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}

/**
 * INTERFACE - PalindromeStrategy
 *
 * This interface defines a contract for all
 * palindrome checking algorithms.
 */
interface PalindromeStrategy {

    boolean check(String input);
}

/**
 * CLASS - StackStrategy
 *
 * This class provides a Stack-based implementation
 * of the PalindromeStrategy interface.
 *
 * It uses LIFO behavior to reverse characters
 * and compare them with the original sequence.
 */
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push each character onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare by popping from stack
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}