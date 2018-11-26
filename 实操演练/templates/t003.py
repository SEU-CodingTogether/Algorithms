def smallest_k_numbers(k, *args):
    """Return a collection containing the k smallest numbers

    Args:
        k: the number of numbers to return
        args: all given numbers 

    Returns:
        A collection of results
    """
    # Put your code here.
    pass

if __name__ == "__main__":
    assert {1,2,3,4} == smallest_k_numbers(4,  4,5,1,6,2,7,3,8)
    assert {} = smallest_k_numbers(0, )
    assert {1} == smallest_k_numbers(1,  1)
    assert {} == smallest_k_numbers(0, 4,5,1,6,2,7,3,8)
    assert {4,5,1,6,2,7,3,8} == smallest_k_numbers(8, 4,5,1,6,2,7,3,8)
    assert {4,5,1,6,2,7,3,8} == smallest_k_numbers(8, 11,33,4,5,1,6,99,384,27,2,7,3,8,10)
    assert {1,99} == smallest_k_numbers(2, 1, 99)
    
