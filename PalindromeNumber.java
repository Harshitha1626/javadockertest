public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 100;  // Starting number
        while (num != Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString())) num++;
        System.out.println("Next palindrome: " + num);
    }
}

