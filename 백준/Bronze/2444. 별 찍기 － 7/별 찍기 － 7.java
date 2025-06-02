import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		star();
	}

	public static void star() {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// 전체
		for(int i=1; i<=2*n-1; i++) {
			//삼각형
			if(i<=n) {
				//공백
				for(int j=1; j<=n-i; j++) {
					System.out.print(" ");
				}
				//별 1개, 3개, 5개.....
				for(int j=1; j<=2*i-1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}else {
				//역삼각형
				for(int j=1; j<=i-n; j++) {
					System.out.print(" ");
				}
				for(int j=1; j<=2*(2*n-i)-1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
	}
}
