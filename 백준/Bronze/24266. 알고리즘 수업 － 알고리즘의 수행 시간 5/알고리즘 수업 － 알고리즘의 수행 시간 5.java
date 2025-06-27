import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		MenOfPassion(A[], n) {
//		    sum <- 0;
//		    for i <- 1 to n
//		        for j <- 1 to n
//		            for k <- 1 to n
//		                sum <- sum + A[i] × A[j] × A[k]; # 코드1
//		    return sum;
//		}
		// i=1 > j=1~n > j=1 > k=1~n => n * n * n <= 실행 횟수
		// => 최고차항 3
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		System.out.println(n*n*n);
		System.out.println(3);
	}
}
