package main;

import java.util.Arrays;

public class SpecialSort {
	/*
	n개의 정수를 가진 배열이 있다. 이 배열은 양의정수와 음의 정수를 모두 가지고 있다.
	이제 당신은 이 배열을 좀 특별한 방법으로 정렬해야 한다.
	정렬이 되고 난 후, 음의 정수는 앞쪽에 양의정수는 뒷쪽에 있어야 한다.
	또한 양의정수와 음의정수의 순서에는 변함이 없어야 한다.
	예. -1 1 3 -2 2 ans: -1 -2 1 3 2.
	*/
	
	public static void main(String[] args) {
		int[] iArr1 = {-1, 1, 3, -2, 2};
		System.out.printf("-1, 1, 3, -2, 2 의 정렬 결과 : %s\n", specialSort(iArr1));
		int[] iArr2 = {-1, 1, 3, -2, 2, -3, 4, -4, 5, -6, 7};
		System.out.printf("-1, 1, 3, -2, 2, -3, 4, -4, 5, -6, 7 의 정렬 결과 : %s\n", specialSort(iArr2));
	}
	
	public static String specialSort(int[] iArr) {
		int[] tmpArr1 = new int[iArr.length];
		int[] tmpArr2 = new int[iArr.length];
		int j = 0;
		int k = 0;
		for(int i = 0; i < iArr.length; i++) {
			if(iArr[i] < 0) tmpArr1[j++] = iArr[i];
			else tmpArr2[k++] = iArr[i];
		}
		for(int i = 0; i < j; i++) {
			iArr[i] = tmpArr1[i];
		}
		for(int i = j, l = 0; i < j + k; i++, l++) {
			iArr[i] = tmpArr2[l];
		}
		String[] strArr = Arrays.stream(iArr).mapToObj(String::valueOf).toArray(String[]::new);
		return String.join(", ", strArr);
	}

}
