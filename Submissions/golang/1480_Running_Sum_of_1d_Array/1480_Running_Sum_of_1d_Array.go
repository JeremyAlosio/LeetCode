package main

import "fmt"

func main() {

	nums := []int{1, 2, 3, 4}

	sums := []int{0}
	for x := 0; x < len(nums); x++ {
		sums = append(sums, nums[x]+sums[x])
	}

	fmt.Print(sums[1:])
}
