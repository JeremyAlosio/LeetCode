package main

import "fmt"

func main() {

	fmt.Println(defangIPaddr("1.1.1.1"))
}

func defangIPaddr(address string) string {

	newAddress := ""
	for i := range address {
		if string(address[i]) == "." {
			newAddress += "[.]"
		} else {
			newAddress += string(address[i])
		}
	}

	return newAddress
}
