import sys 
# input()로 문자열 입력 시 반복문에서는 시간초과 문제 발생. import sys쓰기
sum=0
for i in range(5):
    num=int(sys.stdin.readline())
    if(num<40):
        num=40
    sum+=num
    answer=sum//5
print("{:.0f}".format(answer))