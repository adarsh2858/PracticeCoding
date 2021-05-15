# cook your dish here

T = int(input())

for i in range(T):
    
    inputs = input().split(' ')
    
    N, x, k = list(map(lambda n: int(n), inputs))
    
    flag = False
    tc = []
    
    for j in range(N+1, 0, -k):
        if (j < x):
            break
        tc.append(j)
    
    for j in range(len(tc)):
        if tc[j] == x:
            flag = True
            break

    if(x % k == 0 or flag):
        print("Yes")
    else:
        print("No")
