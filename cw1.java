import java.util.Scanner;
public class cw1 {

    public static void main(String[] args) {
        
        // declare names of arrays as constants
        final char a='1';       
        final char b='2';
        
        /** fill arrays in turn by getting first element and if not 0 continue to get elements until 0 */
        int first[] = fillArray(a);
        int second[] = fillArray(b);
        
        //print arrays
        printArray(a, first);
        printArray(b, second);
        
        
        /** method to find common data and put it in a third array*/
        /** method to display third array, and its length */
        //changed something here to check git1. looks like git is working
        
        /** method to find non-common values between two arrays, do this twice for 1+3, and 2+3*/
    }

    //method to read an array
    private static int[] fillArray(char arrName) {
        final int MAXL = 100; 
        int[] inArray = new int[MAXL];// declare array variable
        inArray = new int[100]; // initialise array          
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter data for array "+arrName+" (0 to finish): ");
        int i=0;
        boolean santinelValue = true;
        while (santinelValue) {
            int element = scanner.nextInt();
            if (element!=0){
                inArray[i] = element;
                System.out.print("Enter data for array "+arrName+" (0 to finish): ");
                i++;
            } else {
                santinelValue = false;
            }
        }
        scanner.close();
        int[] returnArray = new int[i];
        for (int j=0; j<returnArray.length;j++){
            returnArray[j] = inArray[j];
        }
        return returnArray;
    }
    
    //method to write non 0 values of an array (hopefully :( )
    private static void printArray(char arrName, int[] array){
        System.out.print("Values for array " + arrName + " is: ");
        for (int i=0; i< array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.print("\n");
        return;
    }
}
