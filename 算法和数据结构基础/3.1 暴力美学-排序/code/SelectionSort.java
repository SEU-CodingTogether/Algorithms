import java.util.ArrayList;
public class SelectionSort extends SortAlgorithm
{
	
	/**
	 * Sort array.
	 * 
	 * @param array Array to be sorted.
	 */
    public void sort(int[] array) {
        // IMPLEMENT ME
		for (int i = 0; i < array.length - 1; ++i)
		{
			int min = i;
			for (int j = i + 1; j < array.length; ++j )
			{
				if (array[j] < array[min])
					min = j;
			}
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}

    } // end of sort()


} // end of class SelectionSort
