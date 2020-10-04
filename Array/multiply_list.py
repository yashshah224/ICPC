def multiply(arr):
    mul = 1
    for i in arr:
        mul *= i
    return mul


list1 = [2, 4, 6, 8, 5, 3]
print("Multiplication of all elements of given list is {}".format(multiply(list1)))
