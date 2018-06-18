package main;

public class SumOf3 {
	/*
	디지털 시계에 하루동안(00:00~23:59) 3이 표시되는 시간을 초로 환산하면 총 몇 초(second) 일까요?
	디지털 시계는 하루동안 다음과 같이 시:분(00:00~23:59)으로 표시됩니다.
	00:00 (60초간 표시됨)
	00:01 
	00:02 
	...
	23:59
	*/
	
	public static void main(String[] args) {
		System.out.printf("디지털 시계에 하루동안(00:00~23:59) 3이 표시되는"
				+ "시간을 초로 환산하면 총 몇 초(second) 일까요? : %d\n", sumOf3());
	}
	
	public static int sumOf3() {
		int oInt = 0;
		String[] a = {"0","1","2"};
		String[] b = {"0","1","2","3","4","5","6","7","8","9"};
		String[] c = {"0","1","2","3","4","5"};
		String[] d = {"0","1","2","3","4","5","6","7","8","9"};
		String[] timeArr = new String[4];
		for(int i = 0; i < a.length; i++) {
			timeArr[0] = a[i];
			for(int j = 0; j < b.length; j++) {
				if(i == 2 && j > 3) break;
				timeArr[1] = (b[j] + ":");
				for(int k = 0; k < c.length; k++) {
					timeArr[2] = c[k];
					for(int l = 0; l < d.length; l++) {
						timeArr[3] = d[l];
						if(String.join("", timeArr).contains("3")) oInt += 60;
					}
				}
			}
		}
		return oInt;
	}

}
