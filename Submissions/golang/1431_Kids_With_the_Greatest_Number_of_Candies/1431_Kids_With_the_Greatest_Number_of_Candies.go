package main

import "fmt"

func main() {

	fmt.Println(kidsWithCandies([]int{2, 3, 5, 1, 3}, 10))
}

func kidsWithCandies(candies []int, extraCandies int) []bool {

	highestCandy := 0

	for i := 0; i < len(candies); i++ {
		if highestCandy < candies[i] {
			highestCandy = candies[i]
		}
	}

	fmt.Println(highestCandy)

	boolList := []bool{}

	for i := 0; i < len(candies); i++ {
		if highestCandy >= candies[i]+extraCandies {
			boolList = append(boolList, true)
		} else {
			boolList = append(boolList, false)
		}
	}

	return boolList
}
