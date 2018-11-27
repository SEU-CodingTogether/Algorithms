import java.util.ArrayList;

public class BubbleSort extends SortAlgorithm
{
    public void sort(int[] array) {

        for (int i = 0; i < array.length-1 ; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                // 交换
                if (array[j] > array[j+1]) {
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
                    Integer temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
} 