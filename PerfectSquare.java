public class PerfectSquare {
	
	public static void main(String[] args) {
		System.out.println(isPerfectSquare(1));
		System.out.println(isPerfectSquare(4));
		System.out.println(isPerfectSquare(Integer.MAX_VALUE/100));
		System.out.println(isPerfectSquare(255));
		
	}
	
	public static boolean isPerfectSquare(int num) { //Method to check if a number is a perfect square
		for (int i = 1; i <= num / 2; i++) { // Loop from 1 to half of the number
			if (i * i == num) { // Check if the square of i equals the number
				return true; // If a perfect square is found, return true
			}
        }
		return false; // If no perfect square is found, return false
    }
}
