package Day1;
/*Java Prgm to print 1 to 100
 * for multiple of 3 print "Fizz"
 * for multiple of 5 print "Buzz"
 * for multiple of both 3 and 5 print "FizzBuzz"
 */
public class FizzBuzz {
	
	    public static void main(String[] args) {
	        for (int i = 1; i <= 100; i++) {
	            
	            // Check for multiple of both 3 and 5 first
	            if (i % 3 == 0 && i % 5 == 0) {
	                System.out.println("FizzBuzz");
	            }
	            // Check for multiple of 3
	            else if (i % 3 == 0) {
	                System.out.println("Fizz");
	            }
	            // Check for multiple of 5
	            else if (i % 5 == 0) {
	                System.out.println("Buzz");
	            }
	            // If not a multiple of 3 or 5, print the number
	            else {
	                System.out.println(i);
	            }
	        }
	}
}
