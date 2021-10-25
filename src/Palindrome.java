public class Palindrome {
    public static boolean isPalindrome(int number){
        boolean palindrome;

        String numString = String.valueOf(number);
        System.out.println(numString.length());
        if (numString.length() == 5){
            String numReversed = numString.substring(4) + numString.charAt(3) +
                    numString.charAt(2) + numString.charAt(1) + numString.charAt(0);
            System.out.println(numString);
            System.out.println(numReversed);
            palindrome = numReversed.equals(numString);
        } else {
            palindrome = false;
        } return palindrome;
    }
}