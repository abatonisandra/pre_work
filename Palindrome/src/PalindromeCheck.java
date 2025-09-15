public class PalindromeCheck {

    static String reverseString(String name) {
        String reversed = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reversed += name.charAt(i);
        }
        return reversed;
    }
    static boolean isPalindrome(String name) {
        String lowerCaseName = name.toLowerCase();
        String reversed = reverseString(lowerCaseName);
        return lowerCaseName.equals(reversed);
    }

    public static void main(String[] args) {
        String[] names = {"Madam", "Sandra"};

        for (String name : names) {
            if (isPalindrome(name)) {
                System.out.println(name + " is a palindrome.");
            } else {
                System.out.println(name + " is NOT a palindrome.");
            }
        }
    }
}
