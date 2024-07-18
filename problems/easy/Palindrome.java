package problems.easy;

public class Palindrome {
    // Method to reverse a number
    public static int reverseNumber(int num) {
        int rev = 0;
        // Loop until num becomes 0
        while (num>0) {
            // Multiply rev_num by 10 and add the remainder of num divided by 10
            rev = (rev*10) + (num%10);
            // Remove the last digit from num
            num = num/10;
        }
        return rev;
    }
    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int originalNum) {
        int reversedNum = reverseNumber(originalNum);
        return originalNum == reversedNum;
    }


    public static void main(String[] args) {
        int num = 123;
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}
