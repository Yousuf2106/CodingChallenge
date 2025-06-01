package Day1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Call method to check prime
        if (isPrime(number)) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is NOT a Prime Number.");
        }

        sc.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false; // 0 and 1 are not prime
        if (num == 2) return true;  // 2 is prime

        // Check divisibility up to square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }

        return true;

	}

}
