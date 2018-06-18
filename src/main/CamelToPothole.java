package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CamelToPothole {
	/*
	파이썬과 같은 몇몇 프로그래밍 언어는 Pothole_case 를 더 선호하는 언어라고 합니다.
	Example:
	codingDojang --> coding_dojang
	numGoat30 --> num_goat_3_0
	위 보기와 같이 CameleCase를 Pothole_case 로 바꾸는 함수를 만들어요!
	*/
	
	public static void main(String[] args) throws IOException {
		camelToPothole();
	}
	
	public static void camelToPothole() throws IOException {
		String oStr = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Camel Case 로 입력하시오. : ");
		String iStr = br.readLine();
		br.close();
		char[] charArr = iStr.toCharArray();
		for(int i = 0; i < charArr.length; i++) {
			if(charArr[i] >= 'A' && charArr[i] <= 'Z') {
				oStr = oStr + "_";
				charArr[i] += 32;
			} else if(charArr[i] >= '0' && charArr[i] <= '9') {
				oStr = oStr + "_";
			}
			oStr = oStr + charArr[i];
		}
		System.out.print(iStr + " 의 Pothole Case 는 : " + oStr + "\n");
	}

}
