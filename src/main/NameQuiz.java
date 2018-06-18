package main;

import java.util.Arrays;

public class NameQuiz {
	/*
	주어진 문자열(공백 없이 쉼표로 구분되어 있음)을 가지고 아래 문제에 대한 프로그램을 작성하세요.
	이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌
	김씨와 이씨는 각각 몇 명 인가요?
	"이재영"이란 이름이 몇 번 반복되나요?
	중복을 제거한 이름을 출력하세요.
	중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.
	*/
	
	public static void main(String[] args) {
		String iStr = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,"
				+ "최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";
		System.out.printf("김씨와 이씨는 각각 몇 명 인가요? : %d\n", kimLeeCnt(iStr));
		System.out.printf("\"이재영\"이란 이름이 몇 번 반복되나요? : %d\n", repeatCnt(iStr));
		System.out.printf("중복을 제거한 이름을 출력하세요. : %s\n", rmDupName(iStr));
		System.out.printf("중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요. : %s\n", sortAscending(iStr));
	}
	
	public static int kimLeeCnt(String iStr) {
		int kimLeeCnt = 0;
		String[] nameArr = iStr.split(",");
		for(int i = 0; i < nameArr.length; i++) {
			if(nameArr[i].charAt(0) == '김' || nameArr[i].charAt(0) == '이') {
				kimLeeCnt++;
			}
		}
		return kimLeeCnt;
	}
	
	public static int repeatCnt(String iStr) {
		int repeatCnt = 0;
		String[] nameArr = iStr.split(",");
		for(int i = 0; i < nameArr.length; i++) {
			repeatCnt = nameArr[i].equals("이재영") ? repeatCnt + 1 : repeatCnt;
		}
		return repeatCnt;
	}
	
	public static String rmDupName(String iStr) {
		String oStr = "";
		String[] nameArr = iStr.split(",");
		for(int i = 0; i < nameArr.length - 1; i++) {
			if(i == 0) oStr = nameArr[i];
			for(int j = i + 1; j < nameArr.length; j++) {
				if(nameArr[i].equals(nameArr[j])) {
					nameArr[j] = "";
				}
			}
			if(i != 0 && !nameArr[i].equals("")) {
				oStr = oStr + "," + nameArr[i];
			}
		}
		return oStr;
	}
	
	public static String sortAscending(String iStr) {
		String oStr = "";
		String[] nameArr = iStr.split(",");
		for(int i = 0; i < nameArr.length - 1; i++) {
			if(i == 0) oStr = nameArr[i];
			for(int j = i + 1; j < nameArr.length; j++) {
				if(nameArr[i].equals(nameArr[j])) {
					nameArr[j] = "";
				}
			}
			if(i != 0 && !nameArr[i].equals("")) {
				oStr = oStr + "," + nameArr[i];
			}
		}
		String[] tmpArr = oStr.split(",");
		Arrays.sort(tmpArr);
		String.join(",", tmpArr);
		return String.join(",", tmpArr);
	}

}
