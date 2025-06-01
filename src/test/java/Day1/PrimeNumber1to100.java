package Day1;

public class PrimeNumber1to100 {

	public static void main(String[] args) {
		System.out.println("Prime numbers from 1 to 100 are:");

        // Loop from 2 to 100
        for (int num = 2; num <= 100; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

}
