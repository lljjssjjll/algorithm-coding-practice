package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ManageMemory {
	/*
	프로그램 실행 순서
	입력할 정수의 개수를 사용자로부터 입력 받는다.
	입력받은 정수의 개수만큼 정수를 입력받는다.
	입력받은 정수의 합과 평균 값을 출력한다.
	할당된 메모리공간을 비운다.
	요구사항
	메모리공간은 사용자의 입력 수의 따라 변동된다.
	사용한 공간은 마지막에 비워야 한다.
	배열을 사용하면 안된다.
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		printSumAndAvg();
	}
	
	public static void printSumAndAvg() throws NumberFormatException, IOException {
		double sum = 0;		//합계
		double avg = 0d;	//평균
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int intCnt = Integer.parseInt(br.readLine());
		List<Integer> intList = new ArrayList<Integer>();
		for(int i = 0; i < intCnt; i++) {
			intList.add(Integer.parseInt(br.readLine()));
		}
		br.close();
		Iterator<Integer> iter = intList.iterator();
		while(iter.hasNext()) {
			sum += iter.next();
		}
		avg = sum / intCnt;
		System.out.printf("정수의 합 : %f, 평균 : %.2f\n", sum, avg);
	}

}
