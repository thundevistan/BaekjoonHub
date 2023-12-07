def solution(x, n):
    cnt = 0
    x1 = x
    answer = []
    while cnt < n:
        cnt += 1
        answer.append(x)
        x += x1
    return answer