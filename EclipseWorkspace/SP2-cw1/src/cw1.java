import java.util.Scanner;
public class cw1 {

	public static void main(String[] args) {
		// declare names of arrays as constants
		final char a='1';
		final char b='2';
		/** fill arrays in turn by getting first element and if not 0 continue to get elements until 0 */
		int first[] = fillArray(a);
		int second[] = fillArray(b);
		/** method to find common data and put it in a third array*/
		/** method to display third array, and its length */
		//changed something here to check git
		/** method to find non-common values between two arrays, do this twice for 1+3, and 2+3*/
	}
	private static int[] fillArray(char arrName) {
		
		int[] returnArray;// declare array variable
		returnArray = new int[100]; // initialise array

		Scanner scanner;
		scanner = new Scanner(System.in);
		System.out.println("Enter data for array " + arrName +" (0 to finish): ");
		// get first element
		int element = scanner.nextInt();
		while (element !=0){
			
		}
		scanner.close();
		return returnArray;
		}


}
