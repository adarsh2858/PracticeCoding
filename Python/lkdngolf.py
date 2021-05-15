# cook your dish here

T = int(input())

for i in range(T):
    
    inputs = input().split(' ')
    
    N, x, k = list(map(lambda n: int(n), inputs))

    tc = []
    
    flag = False
    
    for j in range(0, N+2, k):
        if (j > x):
            break
        tc.append(j)
    
    for j in range(len(tc)):
        if tc[j] == x:
            flag = True
            break
    
    # print(tc)
    tc = []
    
    for j in range(N+1, 0, -k):
        if (j < x):
            break
        tc.append(j)
    
    for j in range(len(tc)):
        if tc[j] == x:
            flag = True
            break
    
    # print(tc)

    if(flag):
        print("Yes")
    else:
        print("No")
