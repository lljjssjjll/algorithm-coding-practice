package main;

import java.io.IOException;
import java.util.stream.IntStream;

public class MultiplesOf3And5 {
	/*
	10미만의 자연수에서 3과 5의 배수를 구하면 3,5,6,9이다. 이들의 총합은 23이다.
	1000미만의 자연수에서 3,5의 배수의 총합을 구하라.
	*/
	
	public static void main(String[] args) throws IOException {
		int n = 1000;
		System.out.printf("%d 미만의 자연수에서 3과 5의 배수의 총합 : %d\n", n, function1(n));
		System.out.printf("%d 미만의 자연수에서 3과 5의 배수의 총합 : %d\n", n, function2Jdk8(n));
	}
	
	public static int function1(int end) {
		int sum = 0;
		for(int i = 1; i < end; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	public static int function2Jdk8(int end) {
		return IntStream.range(1, end).filter(j -> j % 3 == 0 || j % 5 ==0).sum();
	}
}
