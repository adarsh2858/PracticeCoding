# cook your dish here

def convert_to_integer(n):
    return int(n)

T = int(input())

def find_insertion_index(arr, val):
    for i in range(len(arr)):
        if (arr[i] < val):
            # return the next index
            return

while (T > 0):
    T -= 1
    N, X = map( convert_to_integer, input().split(" "))
    
    pairs = []
    
    for i in range(N):
        S, R = map( convert_to_integer, input().split(" "))
        
        pairs.append((S,R))
        
    best_possible_movie_rating = None
        
    for i in range(len(pairs)):
        if (pairs[i][0] <= X):
            if (best_possible_movie_rating == None):
                best_possible_movie_rating = pairs[i][1]
            elif (best_possible_movie_rating < pairs[i][1]):
                best_possible_movie_rating = pairs[i][1]
        
    print(best_possible_movie_rating)

