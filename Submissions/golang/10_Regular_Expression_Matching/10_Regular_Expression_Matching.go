package main

import "fmt"

func main() {

	fmt.Println(isMatch("a.", "a1"))
}

func isMatch(s string, p string) bool {

	storedValue := s[0]
	currentP := 0
	maxP := len(p)

	for index := range s {

		if s[index] == 46 {
			if len(p) >= index+1 {
				continue
			} else {
				return false
			}
		} else if string(s[index]) != "*" {
			storedValue = s[index]
		}

		if storedValue != p[index] {
			return false
		}
		currentP++
	}

	if currentP != maxP {
		return false
	}

	return true
}
