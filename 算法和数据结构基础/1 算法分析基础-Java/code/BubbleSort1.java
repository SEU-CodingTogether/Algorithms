import java.util.ArrayList;

public class BubbleSort1
{
    /**
     * Sorts the input array.
     * 
     * @param array Arraylist of integers.
     */
    public void sort(ArrayList<Integer> array) {
        
        for (int i = 0; i < array.size(); i++) {
            for (int j = 0; j < array.size() - 1; j++) {
                // check if we need to swap
                if (array.get(j) > array.get(j+1)) {
                    Integer temp = array.get(j);
                    array.set(j, array.get(j+1));
                    array.set(j+1, temp);
                }
            }
        }
    } // end of sort()
    
    
    public static void main(String[] args) {
       
        // construct the sorter we will be using
        BubbleSort1 sorter = new BubbleSort1();
        
        // read in input
        ArrayList<Integer> array = BubbleSortUtils.getInput();
         
        // sort
        sorter.sort(array);
        
        // print out sorted array
        //BubbleSortUtils.print(array);   
    }  // end of main()
    
} // end of class BubbleSort1
