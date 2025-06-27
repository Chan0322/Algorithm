import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		MenOfPassion(A[], n) {
//		    sum <- 0;
//		    for i <- 1 to n
//		        for j <- 1 to n
//		            sum <- sum + A[i] × A[j]; # 코드1
//		    return sum;
//		}
		
		//  => 중첩 반복문 n*n => n의 2제곱
		
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();	=> 500000 * 500000 => int 타입 범위 초과
		long n = sc.nextLong();
		
		System.out.println(n*n);
		System.out.println(2);	
	}
}