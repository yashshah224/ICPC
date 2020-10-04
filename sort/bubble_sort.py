arr = [3,5,1,2,4]
print("Before sorting: ", arr)

for i in range(len(arr)-1):
    for j in range(len(arr)-i-1):
        if arr[j] > arr[j+1]:
            arr[j], arr[j+1] = arr[j+1], arr[j]

print("After sorting: ", arr)
