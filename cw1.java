import java.util.Scanner;
public class cw1 {

	public static void main(String[] args) {
		
		// declare names of arrays as constants
		final char a='1';
		final char b='2';
		/** fill arrays in turn by getting first element and if not 0 continue to get elements until 0 */
		int first[] = fillArray(a);
		int second[] = fillArray(b);
		printArray(a, first);
		printArray(b, second);
		
		
		/** method to find common data and put it in a third array*/
		/** method to display third array, and its length */
		//changed something here to check git1. looks like git is working
		
		/** method to find non-common values between two arrays, do this twice for 1+3, and 2+3*/
	}

	//method to read an array
	private static int[] fillArray(char arrName) {
		int[] returnArray;// declare array variable
		returnArray = new int[100]; // initialise array
		Scanner scanner = new Scanner(System.in);
		// get first element
		
		int i=0;
		while (scanner.hasNextInt()){
			System.out.println("Enter data for array " + arrName +" (0 to finish): ");
			returnArray[i] =  scanner.nextInt();
			i++;
			} ;
		scanner.close();	
		return returnArray;
		}
	
	//method to write non 0 values of an array (hopefully :( )
	private static void printArray(char arrName, int[] array){
		System.out.print("Values for array " + arrName + " is: ");
		for (int i=0; i< array.length; i++){
			// can't find another way of comparing with 0!!!
			if((array[i]*1)!=array[i]){
				System.out.println("\n");
				return;
			}else{
				System.out.print(array[i]+" ");
			}
		}
		System.out.println("\n");
		return;
	}


}
