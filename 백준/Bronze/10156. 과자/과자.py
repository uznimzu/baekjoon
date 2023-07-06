import sys
a,b,c=map(int,sys.stdin.readline().split())
price=a*b
money=(price-c)
if(money<0):
    money=0
print(money)