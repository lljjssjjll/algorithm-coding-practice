package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class OnlyOnceUsed {
	/*
	0~9까지의 문자로 된 숫자를 입력 받았을 때,
	이 입력 값이 0~9까지의 숫자가 각각 한 번 씩만 사용된 것인지 확인하는 함수를 구하시오.
	sample inputs: 0123456789 01234 01234567890 6789012345 012322456789
	sample outputs: true false false true false
	*/
	
	public static void main(String[] args) throws IOException {
		isOnlyOnceUsed();
	}
	
	public static void isOnlyOnceUsed() throws IOException {
		boolean isOnlyOnceUsed = true;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("0 ~ 9자리 숫자를 입력하세요. : ");
		String iStr = br.readLine();
		br.close();
		List<String> numList = new ArrayList<String>(Arrays.asList("0","1","2","3","4","5","6","7","8","9"));
		Stack<String> numStack = (Stack<String>) numList;
		char[] charArr = iStr.toCharArray();
		for(int i = 0; i < charArr.length - 1; i++) {
			for(int j = i + 1; j < charArr.length; j++) {
				if(charArr[i] == charArr[j]) {
					isOnlyOnceUsed = false;
					break;
				}
			}
			if(!isOnlyOnceUsed) {
				break;
			}
		}
		System.out.printf("0123456789 숫자가 한번씩만 사용되었는가? (true or false) : %b\n", isOnlyOnceUsed);
	}

}
