import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		center();
	}
	
	public static void center() {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		// 점의 갯수는 한 변에 존재하는 점의 갯수의 제곱
		// 한 변의 점은 2, 3, 5, 9..... 순으로 증가
		System.out.println((int)Math.pow(Math.pow(2, N)+1, 2));
	}
}
