import java.util.ArrayList;

public class BubbleSort extends SortAlgorithm
{
    /**
     * Sorts the input array.
     *
     * @param array Array to be sorted.
     */
    public void sort(int[] array) {

        for (int i = 0; i < array.length-1 ; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                // check if we need to swap
                if (array[j] > array[j+1]) {
                    Integer temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

    } // end of sort()

} // end of class BubbleSort
