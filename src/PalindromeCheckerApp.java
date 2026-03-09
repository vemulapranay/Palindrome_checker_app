import java.util.Scanner;

// PalindromeChecker class encapsulates the logic
class PalindromeChecker {

    private String text;

    // Constructor
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Public method to check palindrome
    public boolean checkPalindrome() {

        // Normalize string: remove spaces and convert to lowercase
        String normalized = text.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        // Compare characters from both ends
        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Encapsulate logic inside the PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker(input);

        if (checker.checkPalindrome()) {
            System.out.println("The given string is a Palindrome (OOP style).");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        sc.close();
    }
}