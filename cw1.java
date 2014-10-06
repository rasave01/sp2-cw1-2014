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
        System.out.print ("Values for array 1 is ");
        displayElements(a, first);
        
        System.out.print ("Values for array 2 is ");
        displayElements(b, second);
        
        //print common data
        int commonArray[]=common(first,second);
        System.out.print ("Common data is ");
        displayElements(a, commonArray);
        
        /** method to find common data and put it in a third array*/
        /** method to display third array, and its length */
        //changed something here to check git1. looks like git is working
        
        /** method to find non-common values between two arrays, do this twice for 1+3, and 2+3*/
    }

    //method to read an array
    private static int[] fillArray(char arrName) {
        final int MAXL = 100; 
        int[] inArray = new int[MAXL];// declare array variable         
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter data for array "+arrName+" (0 to finish): ");
        int i=0;
        boolean santinelValue = true;
        while (santinelValue) {
            int element = scanner.nextInt();
            if (element!=0){
                // element not zeroes so we can check if it is in array already
                //for this loop through the elements already in the array, 
                //no point cheking beyond counter as data has not been entered there yet
                // need a flg to indicate that, chose found
                boolean found = false;
                for(int k=0; k<i; k++){
                    if(inArray[k]== element){
                        //if element same as array[k] change flag 
                        found = true;
                    }
                }    
                if (!found){
                    //if not in array already the put it in
                    inArray[i] = element;
                    i++;
                }   
                System.out.print("Enter data for array "+arrName+" (0 to finish): ");
            } else {
                santinelValue = false;
            }
        }
        scanner.close();
        // initialise the return array in order to get rid of zeroes
        int[] returnArray = new int[i];
        for (int j=0; j<returnArray.length;j++){
            returnArray[j] = inArray[j];
        }
        return returnArray;
    }
    
    //method that takes two int arrays and returns an array of common values
    private static int[] common(int[] arrayA, int[] arrayB){
       //find out the number of common values first so that an array can be returned
        int n=0;
        for(int i=0; i<arrayA.length; i++){
            for (int j=0;j<arrayB.length; j++){
                if(arrayA[i]==arrayB[j]){
                    n++;
                }
            } 
        } 
       //initiate return array and repeat the process above, but this time add data to return array and 
       //increase counter each time an element is added
        int[] common = new int[n];
        n = 0;
        for(int i=0; i<arrayA.length; i++){
            for (int j=0;j<arrayB.length; j++){
                if(arrayA[i]==arrayB[j]){
                    common[n] = arrayA[i];
                    n++;
                }
            } 
        } 
        return common;
    }
 
    //method to write the array to console in the same format as required
    private static void displayElements(char arrName, int[] array){
        for (int i=0; i< array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.print("\n");
        return;
    }
}
