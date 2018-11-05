import argparse
import sys
import time
from BubbleSort import BubbleSort
from SelectionSort import SelectionSort


if __name__ == '__main__':
    parser = argparse.ArgumentParser()
    parser.add_argument(
        '--method',
        type=str,
        default='bubble',
        help="""
                Method of sort
            """
    )

    parser.add_argument(
        '--data',
        type=str,
        default='./debug.txt',
        help="""
            Path to data file
        """
    )

    args = parser.parse_args()
    #获得排序算法名
    algorithmUsed = args.method
    #获得需要排序的数据集
    fileName = args.data;            
    # 从文件读入数据,并使用读入的数据创建列表
    array=[]
    with open(fileName,'r') as f:
        for line in f:
            temp1 = line.strip('\n')
            temp2 = temp1.strip('\t')
            array.append(temp2)
            k = len(array)
        for i in range(len(array)):
            array.append(float(array[i]))
        del(array[0:k])
    # 选择合适的算法
    if algorithmUsed == 'bubble':
        sortAlgor = BubbleSort()
    elif algorithmUsed == 'select':
        sortAlgor = SelectionSort()
    else:
        print("Error: " + algorithmUsed + "is invalid.")
        array = None
        sys.exit(1)
    time_start=time.time()
    #排序
    array = sortAlgor.mysort(array)
    #length = len(array)
    #for num in range(length):
    #    print(array[num])
    time_end=time.time()
    print('Time cost:',time_end-time_start,'s')