import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		MenOfPassion(A[], n) {
//		    sum <- 0;
//		    for i <- 1 to n - 2
//		        for j <- i + 1 to n - 1
//		            for k <- j + 1 to n
//		                sum <- sum + A[i] × A[j] × A[k]; # 코드1
//		    return sum;
//		}
		// 입력 7
		// i = 1~5 / j = i+1~6 / k = j+1~7
		// i=1 / j=2,3,4,5,6 / j=2->k=3,4,5,6,7 | j=3->k=4,5,6,7 | j=4->k=5,6,7 ..... j=6->k=7
		//			=> 실행 횟수 5 4 3 2 1
		// i=2 / j=3,4,5,6 / j=3->k=4,5,6,7 ...... => 실행 횟수 4 3 2 1
		// i=3 / j=4,5,6 / j=4->k=5,6,7 ..... => 실행 횟수 3 2 1
		// i=4 => 실행 횟수 2 1
		// i=5 => 실행 횟수 1
		// 실행횟수는 (n-2)! + (n-3)! + (n-4)! + (n-5)! + (n-6)! => (n-(i+1))!
		Scanner sc = new Scanner(System.in);
		long sum = 0;
		long n = sc.nextLong();
		
//		for(int i=1; i<=n-2; i++) {
//			for(int j=i+1; j<=n-1; j++) {
//				for(int k=j+1; k<=n; k++) {
//					sum++;
//				}
//			}
//		}			=> 시간 초과!
		// => n(n-1)(n-2)/(3*2*1)
		
		System.out.println((n*(n-1)*(n-2))/6);
		System.out.println(3);
	}
}
