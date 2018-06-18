package main;

public class MinDist {
	/*
	1차원의 점들이 주어졌을 때, 그 중 가장 거리가 짧은 것의 쌍을 출력하는 함수를 작성하시오.
	(단 점들의 배열은 모두 정렬되어있다고 가정한다.)
	예를들어 S={1, 3, 4, 8, 13, 17, 20} 이 주어졌다면, 결과값은 (3, 4)가 될 것이다.
	*/
	
	public static void main(String[] args) {
		int[] iArr = {1, 3, 5, 8, 13, 17, 20, 21, 22, 34, 44, 50};
		System.out.println(minDist(iArr));
	}
	
	public static String minDist(int[] iArr) {
		String oStr = "";
		int minDist = Math.abs(iArr[1] - iArr[0]);
		for(int i = 1; i < iArr.length - 1; i++) {
			if(Math.abs(iArr[i + 1] - iArr[i]) < minDist) {
				minDist = Math.abs(iArr[i + 1] - iArr[i]);
				oStr = "(" + iArr[i] + ", " + iArr[i + 1] + ")";
			}
		}
		return oStr;
	}

}
