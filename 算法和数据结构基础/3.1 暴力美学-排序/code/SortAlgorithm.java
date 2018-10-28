
public abstract class SortAlgorithm
{
    /**
     * Implement sort functionality.
     * 
     * @param data Input integer array to be sorted.
     */
    public abstract void sort(int[] data);

    
    /**
     * Helper function to swap elements in array.
     */
    protected final void swap(int[] array, int i, int j)
    {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    } // end of swap()
    
} // end of class SortAlgorithm
