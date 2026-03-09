import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {

    // Simple two-pointer palindrome check
    public static boolean twoPointer(String text) {
        String str = text.replaceAll("\\s+", "").toLowerCase();
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    // Stack-based palindrome check
    public static boolean stackBased(String text) {
        String str = text.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) stack.push(c);

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }

    // Deque-based palindrome check
    public static boolean dequeBased(String text) {
        String str = text.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : str.toCharArray()) deque.addLast(c);

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Two-pointer method
        long startTime = System.nanoTime();
        boolean result1 = twoPointer(input);
        long duration1 = System.nanoTime() - startTime;

        // Stack method
        startTime = System.nanoTime();
        boolean result2 = stackBased(input);
        long duration2 = System.nanoTime() - startTime;

        // Deque method
        startTime = System.nanoTime();
        boolean result3 = dequeBased(input);
        long duration3 = System.nanoTime() - startTime;

        // Display results
        System.out.println("\nPalindrome Check Results:");
        System.out.printf("Two-Pointer: %b (Time: %d ns)\n", result1, duration1);
        System.out.printf("Stack: %b (Time: %d ns)\n", result2, duration2);
        System.out.printf("Deque: %b (Time: %d ns)\n", result3, duration3);

        sc.close();
    }
}