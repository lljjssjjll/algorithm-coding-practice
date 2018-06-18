package main;

public class BoardPaging {
	/*
	A씨는 게시판 프로그램을 작성하고 있다.
	A씨는 게시물의 총 건수와 한 페이지에 보여줄 게시물수를 입력으로 주었을 때 총 페이지수를 리턴하는 프로그램이 필요하다고 한다.
	입력 : 총건수(m), 한페이지에 보여줄 게시물수(n) (단 n은 1보다 크거나 같다. n >= 1)
	출력 : 총페이지수
	A씨가 필요한 프로그램을 작성하시오.
	*/
	
	public static void main(String[] args) {
		System.out.printf("총 건수 : %d, 한 페이지 게시물 수 : %d, 총 페이지 수 : %d\n", 0, 1, totPage(0, 1));
		System.out.printf("총 건수 : %d, 한 페이지 게시물 수 : %d, 총 페이지 수 : %d\n", 1, 1, totPage(1, 1));
		System.out.printf("총 건수 : %d, 한 페이지 게시물 수 : %d, 총 페이지 수 : %d\n", 2, 1, totPage(2, 1));
		System.out.printf("총 건수 : %d, 한 페이지 게시물 수 : %d, 총 페이지 수 : %d\n", 1, 10, totPage(1, 10));
		System.out.printf("총 건수 : %d, 한 페이지 게시물 수 : %d, 총 페이지 수 : %d\n", 10, 10, totPage(10, 10));
		System.out.printf("총 건수 : %d, 한 페이지 게시물 수 : %d, 총 페이지 수 : %d\n", 11, 10, totPage(11, 10));
	}
	
	public static int totPage(int m, int n) {
		int totPage = 0;
		totPage = m / n;
		totPage += (m % n != 0) ? 1 : 0;
		return totPage;
	}

}
