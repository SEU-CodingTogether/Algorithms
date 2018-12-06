# -*- coding: utf-8 -*-


def fibonacci(n):
    if n==0:
        return 1
    elif n == 1 or n == 2:
        return n
    else:
        return fibonacci(n-1) + fibonacci(n-2)
    

if __name__ == "__main__":

    assert 1 == fibonacci(0)

    assert 1 == fibonacci(1)

    assert 2 == fibonacci(2)

    assert 8 == fibonacci(5)

    assert 89 == fibonacci(10)

    assert 10946 == fibonacci(20)