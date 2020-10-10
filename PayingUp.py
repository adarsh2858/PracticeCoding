t=int(input())
for _ in range(t):
    n,m=map(int,input().split(' '))
    notes=[]
    for i in range(n):
        notes.append(int(input()))
    notes=sorted(notes)
    flag=False
    if(n<=20):
        for i in range(len(notes)):
            if(notes[i]<=1000):
                sum=notes[i]
                for j in range(len(notes)):
                    if(sum+notes[j]==m):
                        flag=True
                        break
                    elif(sum+notes[j]<m):
                        sum+=notes[j]
                if(flag):
                    break
            else:
                break
    if(flag):
        print('Yes')
    else:
        print('No')        