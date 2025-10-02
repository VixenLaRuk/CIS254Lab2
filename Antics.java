
public class Antics {

    /**
     * 
     * @param str the input string to be checked.
     * @return true if the string is a palindrome, flase otherwise
     */

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while(left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * 
     * @param str the input string to be checked.
     * @return true if the string is abecedarian, false otherwise.
     */

    public static boolean isAbecedarian(String str) {
        str = str.toLowerCase();

        for (int i = 0; i < str.length()-1; i++) {

            if (str.charAt(i) > str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 
     * @param str the input string to be checked.
     * @return true if the string is a pangram, false otherwise.
     */

    public static boolean isPangram(String str) {
        str = str.toLowerCase();

        for (char c = 'a'; c <= 'z'; c++) {
            if (str.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }

    /**
     * 
     * @param str the input string to be capitalized.
     * @return the input string with the first letter capitalized
     */

    public static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str; // empty or null
        }
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }
}