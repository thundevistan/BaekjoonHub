def solution(n):
    x = 1
    while True:
        if n % x == 1:
            answer = x
            break
        x += 1
            
    return answer