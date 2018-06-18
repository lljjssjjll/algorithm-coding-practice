package main;

public class TabToSpace {
	/*
	A씨는 개발된 소스코드를 특정업체에 납품하려고 한다.
	개발된 소스코드들은 탭으로 들여쓰기가 된것, 공백으로 들여쓰기가 된 것들이 섞여 있다고 한다.
	A씨는 탭으로 들여쓰기가 된 모든 소스를 공백 4개로 수정한 후 납품할 예정이다.
	A씨를 도와줄 수 있도록 소스코드내에 사용된 탭(Tab) 문자를 공백 4개(4 space)로 바꾸어 주는 프로그램을 작성하시오.
	*/
	
	public static void main(String[] args) {
		String iStr = "탭이\t들어간 문자열\t예시";
		System.out.println("탭 제거 전 : " + iStr);
		System.out.println("탭 제거 후 : " + tabTo4Space(iStr));
	}
	
	public static String tabTo4Space(String iStr) {
		String oStr = "";
		char[] charArr = iStr.toCharArray();
		for(int i = 0; i < charArr.length; i++) {
			if(charArr[i] == '\t') oStr += "    ";
			else oStr += charArr[i];
		}
		return oStr;
	}

}
