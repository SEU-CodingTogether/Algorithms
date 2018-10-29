import java.util.*;

public class BubbleSortUtils
{
	
    /**
     * Reads in an array of integers from stdin.
     * 
     * @return An arraylist of integers read from stdin.
     */
    public static ArrayList<Integer> getInput() {
        Scanner in = new Scanner(System.in);
        
        ArrayList<Integer> array = new ArrayList<Integer>();
        
        // Read in the number of elements
        while (in.hasNextInt()) {
            array.add(new Integer(in.nextInt()));
        }
        
        return array;
    } // end of getInput()
    
    
    /**
     * Prints out the contents of the array to stdout.
     * 
     * @param array Arraylist of integers.
     */
    public static void print(ArrayList<Integer> array) {
        Iterator ait = array.iterator();
        
        while (ait.hasNext()) {
            System.out.print(ait.next() + " ");
        }
        System.out.println();
    } // end of print()
    

} // end of class BubbleSortUtils