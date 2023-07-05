import sys
a,b,c=map(int,sys.stdin.readline().split())
if (a==b==c):
    ans=10000+a*1000
    print(ans)
elif(a==b or a==c):
    print(a*100+1000)
elif(b==c):
    print(b*100+1000)
else:
    print(max(a,b,c)*100)