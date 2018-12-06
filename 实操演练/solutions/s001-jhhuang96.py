# -*- coding: utf-8 -*-


def get_first_duplicated_number(numbers):
    '''
    输入参数:
    numbers:     输入的数组
    duplication: 输出数组，判题程序会取duplication[0] 作为重复的数字
    '''
    # write code here
    #if numbers == None:
    if not numbers:
        return -1
    dict = {}
    duplication =[]
    for num in numbers:
        if num not in dict:
            dict[num] = 0
        else:
            duplication.append(num)
    if duplication:
        return duplication[0]
    else:
        return -1


if __name__ == "__main__":

    assert 2 == get_first_duplicated_number([2, 3, 1, 0, 2, 5, 3])

    assert 1 == get_first_duplicated_number([2, 3, 4, 0, 9, 8, 7, 1, 1])

    assert -1 == get_first_duplicated_number([2, 3, 4, 0, 9, 8, 7, 10, 13])

    assert -1 == get_first_duplicated_number([])

    assert -1 == get_first_duplicated_number(None)

    assert 1 == get_first_duplicated_number([2, 1, 1, 2])

    assert -1 == get_first_duplicated_number([1])

    assert 1 == get_first_duplicated_number([1, 1])
