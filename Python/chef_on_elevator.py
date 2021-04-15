# cook your dish here
import math

def str_to_int(n):
    return int(n)

number_of_test_cases = int(input())

while (number_of_test_cases > 0):
    number_of_test_cases -= 1
    
    [n, v1, v2] = map( str_to_int, input().split(" "))
    
    distance_by_stairs = n * math.sqrt(2)
    time_taken_by_stairs = distance_by_stairs / v1

    distance_by_elevator = n + n
    time_taken_by_elevator = distance_by_elevator / v2
    
    # print(time_taken_by_stairs)
    # print(time_taken_by_elevator)
    
    if(time_taken_by_stairs < time_taken_by_elevator):
        print("Stairs")
    else:
        print("Elevator")
