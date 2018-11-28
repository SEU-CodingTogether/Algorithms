# -*- coding: utf-8 -*-


def partition(alist, start, end):
    if end <= start:
        return
    base = alist[start]
    while start < end:
        while start < end and alist[end] >= base:
            end -= 1
        alist[start] = alist[end]
        while start < end and alist[start] <= base:
            start += 1
        alist[end] = alist[start]
    alist[start] = base
    return start


def smallest_k_numbers(k, alist):
    if  k==0 or not alist :
        return []
    length = len(alist)
    if length == k:
        return alist
    if not alist or k <=0 or k > length:
        return
    start = 0
    end = length - 1
    index = partition(alist, start, end)
    while index != k:
        if index > k:
            index = partition(alist, start, index - 1)
        elif index < k:
            index = partition(alist, index + 1, end)
    return alist[:k]



if __name__ == "__main__":

    assert [1,2,3,4] == smallest_k_numbers(4,  [4,5,1,6,2,7,3,8])

    assert [] == smallest_k_numbers(0, [])

    assert [1] == smallest_k_numbers(1, [1])

    assert [] == smallest_k_numbers(0, [4,5,1,6,2,7,3,8])

    assert [4,5,1,6,2,7,3,8] == smallest_k_numbers(8, [4,5,1,6,2,7,3,8])

    #assert [4,5,1,6,2,7,3,8] == smallest_k_numbers(8, [11,33,4,5,1,6,99,384,27,2,7,3,8,10])

    assert [1,99] == smallest_k_numbers(2, [1, 99])