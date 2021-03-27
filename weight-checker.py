# cook your dish here

def convert_to_int(n):
    return int(n)

T = int(input())

while T > 0:
    T-=1
    inputs = input().split(' ')
    w1, w2, x1, x2, M = map(convert_to_int, inputs)
    
    min_weight = w1 + (M * x1)
    max_weight = w1 + (M * x2)
    
    if (w2 >= min_weight and w2 <= max_weight):
        print(1)
    else:
        print(0)
