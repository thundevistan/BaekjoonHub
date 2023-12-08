def solution(x):
    arr = list(str(x))
    arr_length = len(arr)
    sum_length = 0
    for i in range(arr_length):
        sum_length += int(arr[i])

    answer = None
    if x % sum_length == 0:
        answer = True
    else:
       answer = False

    return answer