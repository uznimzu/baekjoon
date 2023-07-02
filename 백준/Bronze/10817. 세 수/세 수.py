a,b,c = map(int,input().split())
mylist=[a,b,c]
mylist.remove(min(mylist))
mylist.remove(max(mylist))
print(int(mylist[0]))