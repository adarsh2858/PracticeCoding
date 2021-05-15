package main

import (
	"fmt"
	// "strings"
)

func main() {
	// your code goes here
	var N, X, A, B, result int

	fmt.Scanln(&N)

	for i := 0; i < N; i++ {
		fmt.Scanf("%d %d %d", &X, &A, &B)

		result = A + (100-X)*B

		fmt.Println(result * 10)
	}

}
