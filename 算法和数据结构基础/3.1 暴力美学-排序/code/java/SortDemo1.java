//SortDemo1.java
import java.io.*;
import java.util.*;


public class SortDemo1
{
    protected static final String progName = "SortDemo1";

    /**可以调用的算法*/
    public enum Mode {
        BUB,
        SELECT
    }

    /**
     打印基本信息。
     */
    protected static void printUsage(String progName) {
        System.err.println("USAGE: " + progName + " [sort method] [input file]");
        System.err.println("  sort methods [bubble, quick, merge, cocktail]");
        System.err.println("EXAMPLE: " + progName + " quick random.txt");
    }
    /**
     * 主函数。接受命令行参数-包括算法名字和排序数据集
     */
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                printUsage(progName);
                System.exit(1);
            }
            // 获得排序算法名
            String algorithmUsed = args[0];
            // 获得需要排序的数据集
            String fileName = args[1];

            File inFile = new File(fileName);
            Scanner in = new Scanner(inFile);

            // 从文件读入数据
            ArrayList<Integer> buffer = new ArrayList<Integer>();
            while (in.hasNextInt()) {
                buffer.add(new Integer(in.nextInt()));
            }

            // 使用读入的数据创建列表
            int[] array = new int[buffer.size()];
            Iterator bit = buffer.iterator();
            int j = 0;
            while (bit.hasNext()) {
                array[j] = (Integer) bit.next();
                j++;
            }
            buffer = null;

            // 选择合适的算法
            SortAlgorithm sortAlgor = null;
            switch(algorithmUsed) {
                case "bubble":
                    sortAlgor = new BubbleSort();
                    break;
                case "select":
                    sortAlgor = new SelectionSort();
                    break;
                default:
                    System.err.println("Error: " + algorithmUsed + "is invalid.");
                    array = null;
                    printUsage(progName);
                    System.exit(1);
            }

            long startTime = System.nanoTime();
            // 排序
            sortAlgor.sort(array);
            long endTime = System.nanoTime();
            // 打印排序后的数组
//            for (int i = 0; i < array.length; i++) {
//                System.out.println(array[i]);
//            }
            double timeElapsed = (endTime - startTime) / Math.pow(10, 9);
            System.out.println("Time elapsed (secs): " + timeElapsed);
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
            printUsage(progName);
        }
    }
} 