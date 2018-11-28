def get_first_duplicated_number(num_list):
    """Return the first duplicated number of the given list. If no duplicated number, return -1.
    Args:
        num_list: given list

    Returns:
        The first duplicated number
    """
    # Put your code here
    pass
if __name__ == "__main__":
    assert 2 == get_first_duplicated_number([2,3,1,0,2,5,3])
    assert 1 == get_first_duplicated_number([2,3,4,0,9,8,7,1,1])
    assert -1 == get_first_duplicated_number([2,3,4,0,9,8,7,10,13])
    assert -1 == get_first_duplicated_number([])
    assert -1 == get_first_duplicated_number(None)
    assert 1 == get_first_duplicated_number([2,1,1,2])
    assert -1 == get_first_duplicated_number([1])
    assert 1 == get_first_duplicated_number([1, 1])
