package com.spring.basics.spring.in5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	//what are the beans 
	//what are the dependencies for a bean (the dependency for binarySearchImpl is sortAlgorithm
	//where to search for beans --> no need for this example, because spring looks for beans
	//in the package where @SpringBooTApplication is
	public static void main(String[] args) {
		
		//now if we want to use bubble sort we type this code:
		//BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new BubbleSortAlgorithm());
		//now if we want to use quick sort we just change code in the constructor:
		//BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new QuickSortAlgorithm2());
		
		//Application context is used for managing beans
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearchImpl.binarySearch(new int[] {124, 6,}, 3);
		System.out.println(result);
		
		
		
		//SpringApplication.run(SpringIn5StepsApplication.class, args);
	}

}
