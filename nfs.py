# cook your dish here

import math

def convert_to_integer(n):
    return int(n)

T = int(input())

while(T > 0):
    T -= 1
    
    turning_possible = False
    
    U, V, A, S = map( convert_to_integer, input().split(" "))
    
    rhs = U*U - 2*A*S
    
    # check if the right hand side of the equation is positive
    if (rhs > 0):
        # calculate the square root only for a positive number
        lhs=math.sqrt(rhs)
        # compare with the given max velocity constraint
        if (lhs <= V):
            turning_possible = True
    else:
        turning_possible = True
        
    if (turning_possible):
        print("Yes")
    else:
        print("No")
    
    
