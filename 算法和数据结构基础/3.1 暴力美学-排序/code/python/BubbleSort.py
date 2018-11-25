# -*- coding: utf-8 -*-

class BubbleSort:
        
    def mysort(self,array):
        length = len(array)
        for i in range(length):
            for j in range(length-1-i):
                if array[j] > array[j+1]:
                    temp = array[j]
                    array[j] = array[j+1]
                    array[j+1] = temp
        return array#end of sort()
    
