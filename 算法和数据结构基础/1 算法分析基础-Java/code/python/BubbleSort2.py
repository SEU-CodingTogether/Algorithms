# -*- coding: utf-8 -*-
import random
import time

class BubbleSort2:
    # 生成随机数,返回排序后的结果
    # start, end为限制随机数生成的范围
    # count为生成的随机数个数
    def __init__(self, start, end, count):
        self.start = start
        self.end = end
        self.count = count
        self.number_list = []
        
        
    def __generate(self):
        for i in range(0, self.count):
            elements = random.randint(self.start, self.end)
            self.number_list.append(elements)
        return self.number_list
    
    def __mysort(self):
        self.number_list = self.__generate()
        length = self.count
        swapped = True
        while swapped:
            swapped = False;
            for  i in range(length-1):
                # check if we need to swap
                if self.number_list[i] > self.number_list[i+1]: 
                    temp = self.number_list[i]
                    self.number_list[i] = self.number_list[i+1]
                    self.number_list[i+1] = temp
                    swapped = True           
            length = length-1
        return self.number_list #end of sort()
    
    def prints(self):
        return self.__mysort()

# 使用示例
if __name__ == "__main__":
    # 打印排序后的结果
    time_start=time.time()
    sorted_data = BubbleSort2(10, 1000, 100)
    for num in sorted_data.prints():
        print(num)
    time_end=time.time()
    print('Time cost:',time_end-time_start,'s')