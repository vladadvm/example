package com.spring.basics.spring.in5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	//this is the interface with the method sort
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	/*@Autowired 
	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	} when using setter injection the autowired goes abouve the setter method
	  and if you don't use constructor or setter, you can just leave @Autowire
	  above the dependency and spring will treat as something like setter injection*/
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}

	
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		//bubble sorting is the sorting logic - this stays just as a reminder
		//now i want quick sort - this stays just as a reminder
		
		//implementing sort logic becomes calling a method from another class
		//but the problem is you can't dynamically change algorithms 
		//without changing the binarySearch method
		//QuickSortAlgorithm2 quickSortAlgorithm2 = new QuickSortAlgorithm2();
		//int[] sortedNumbers = quickSortAlgorithm2.sort(numbers);
		//BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		//int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
		
		int[] sortedNumbers = sortAlgorithm.sort(numbers); 
		
		//search the array
		
		//return the result
		return 3;
		
	}

	
	
	
	
	
}
