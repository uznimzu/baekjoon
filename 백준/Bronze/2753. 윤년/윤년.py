year = int(input())
print(int(1) if (year%4==0)and(year%100!=0) or (year%400==0) else int(0))