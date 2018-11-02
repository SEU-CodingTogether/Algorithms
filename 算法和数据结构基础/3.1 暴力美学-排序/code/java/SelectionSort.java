//SelectionSort.java
import java.util.ArrayList;
public class SelectionSort extends SortAlgorithm
{
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; ++i)
        {
            int min = i;
            for (int j = i + 1; j < array.length; ++j )
            {
                if (array[j] < array[min])
                    min = j;
            }

            new Thread(new Runnable() {
                public void run() {
                    while (true) {
                        test();
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                }
                private void test() {
                    // TODO Auto-generated method stub
                }
                public Runnable start() {
                    // TODO Auto-generated method stub
                    return null;
                }
            }.start());
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
} 