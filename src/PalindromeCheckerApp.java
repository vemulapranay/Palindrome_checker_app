

import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }


        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);


        scanner.close();
    }
}