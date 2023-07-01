a = int(input())
for i in range(a):
    answerlist=list(map(str,input().split()))
    num = float(answerlist[0])
    for j in range(len(answerlist)):
        if answerlist[j]=="@":
            num = num * 3
        elif answerlist[j]=="%":
            num= num +5
        elif answerlist[j]=="#":
            num = num - 7
    print("%.2f"%num)