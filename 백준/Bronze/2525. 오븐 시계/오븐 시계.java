import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ovenTest();
	}

	public static void ovenTest() {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int C = sc.nextInt();
		
		int min = 0;
		int h = 0;
		int m = 0;
		
		if(A<=23&&A>=0 && B>=0&&B<=59) {
			min = A*60 + B + C; //조리 시간 연산.
			h = min/60; //시
			m = min%60; //분
			if(h>=24) { // 기존 코드에서 h>=23을 수정.
				h = h-24;
			}
		}
		
		
		
		
		System.out.println(h + " " + m);
		
	}
}
