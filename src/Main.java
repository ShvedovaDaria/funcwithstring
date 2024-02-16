import java.util.Arrays;

public class Main {

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    public static int countVowels(String input) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPalindrome(String input) {
        String reversed = reverseString(input);
        return input.equalsIgnoreCase(reversed);
    }

    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (result.indexOf(String.valueOf(c)) == -1) {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static String[] splitIntoWords(String input) {
        return input.split("\\s+");
    }

    public static void main(String[] args) {

        String original = "hello";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        String text = "Hello World";
        int vowelCount = countVowels(text);
        System.out.println("Number of vowels: " + vowelCount);

        String palindromeTest = "Racecar";
        boolean isPalindrome = isPalindrome(palindromeTest);
        System.out.println(palindromeTest + " is a palindrome: " + isPalindrome);

        String stringWithDuplicates = "hello";
        String withoutDuplicates = removeDuplicates(stringWithDuplicates);
        System.out.println("Original: " + stringWithDuplicates);
        System.out.println("Without duplicates: " + withoutDuplicates);

        String sentence = "Hello world";
        String[] words = splitIntoWords(sentence);
        System.out.println("Original sentence: " + sentence);
        System.out.println("Words array: " + Arrays.toString(words));
    }
}
