package problems.easy;

public class ReverseNumber {

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

    public static void main(String[] args) {
        int num = 54321;
        int reversed = reverseNumber(num);
        System.out.println("Reversed number: " + reversed);  // Output: Reversed number: 12345
    }
}
