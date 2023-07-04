n = int(input())
sum = 0
answer=0
for i in range (1, n+1):
    sum += i
    answer=i

    if sum > n:
        answer=i-1
        break
    
print(answer)