//SortAlgorithm.java
public abstract class SortAlgorithm
{
    public abstract void sort(int[] data);
    protected final void swap(int[] array, int i, int j)
    {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}