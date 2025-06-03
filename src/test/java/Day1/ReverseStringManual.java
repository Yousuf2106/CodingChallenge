package Day1;
import java.util.Scanner;

public class ReverseStringManual {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        // Reverse logic
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);  // append each character in reverse order
        }

        // Output result
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }

}
