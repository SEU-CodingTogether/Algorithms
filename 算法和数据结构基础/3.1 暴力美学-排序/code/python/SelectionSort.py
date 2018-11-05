# -*- coding: utf-8 -*-
class SelectionSort:
        
    def mysort(self,array):       
        length = len(array)
        for i in range(length-1):
            min = i
            for j in range(i+1,length):
                if array[j] < array[min]:
                    min = j
            temp = array[i]
            array[i] = array[min]
            array[min] = temp
        return array #end of sort()