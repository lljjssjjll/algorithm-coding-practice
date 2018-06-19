package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class OnlyOnceUsed {
	/*
	0~9까지의 문자로 된 숫자를 입력 받았을 때,
	이 입력 값이 0~9까지의 숫자가 각각 한 번 씩만(최소) 사용된 것인지 확인하는 함수를 구하시오.
	sample inputs: 0123456789 01234 01234567890 6789012345 012322456789
	sample outputs: true false false true false
	*/
	
	public static void main(String[] args) throws IOException {
		isOnlyOnceUsed();
	}
	
	public static void isOnlyOnceUsed() throws IOException {
		System.out.print("0 ~ 9자리 숫자를 입력하세요. : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String iStr = br.readLine();
		br.close();
		
		Stack<String> numStack = new Stack<String>();
		for(int i = 0; i < 10; i++) {
			numStack.push(String.valueOf(i));
		}
		
		boolean isOnlyOnceUsed = true;
		
		int initStackSize = numStack.size();
		int cnt = 0;
		
		while(true) {
			String num = numStack.peek();
			cnt++;
			if(iStr.contains(num) && cnt <= initStackSize) {
				numStack.pop();
				iStr = iStr.replaceFirst(num, "");
				if(numStack.size() == 0) break;
			} else {
				isOnlyOnceUsed = false;
				break;
			}
		}
		
		if(iStr.length() != 0) isOnlyOnceUsed = false;
		
		System.out.printf("0123456789 숫자가 각각 최소 한번씩 사용되었는가? (true or false) : %b\n", isOnlyOnceUsed);
	}

}
