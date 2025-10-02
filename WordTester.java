import java.util.Scanner;

public class WordTester {

    public static void main(String[] args) {

        String text;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter word or sentence (exit to end): ");
            text = input.nextLine();
            System.out.println("Text: " + text);
            System.out.println("Is Palindrome: " + Antics.isPalindrome(text));
            System.out.println("Is Abecedarian: " + Antics.isAbecedarian(text));
            System.out.println("Is Pangram: " + Antics.isPangram(text));
            System.out.println("Capitalized: " + Antics.capitalizeFirstLetter(text));

        System.out.println("-------------------------------------");
            } while (!text.equalsIgnoreCase("exit"));
            System.out.println("Goodbye");
            input.close();
    }
}
