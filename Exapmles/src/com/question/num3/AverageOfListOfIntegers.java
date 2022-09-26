package com.question.num3;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageOfListOfIntegers {
 public static void main(String[] args) {
	 
	List<Integer> numbers = Arrays.asList(10,20,30,40,50,60);
	
	OptionalDouble  average = numbers.stream().mapToInt(Integer :: intValue).average();
	
	System.out.println(average);
	
 }
}
