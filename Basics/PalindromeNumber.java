import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int originalNumber = number;
        int reversedNumber = 0;
        
        while(number != 0) {
            int digit = number % 10;          // Get last digit
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;             // Remove last digit
        }
        
        if(originalNumber == reversedNumber) {
            System.out.println("Palindrome Number ✅");
        } else {
            System.out.println("Not a Palindrome ❌");
        }
        
        sc.close();
    }
}
