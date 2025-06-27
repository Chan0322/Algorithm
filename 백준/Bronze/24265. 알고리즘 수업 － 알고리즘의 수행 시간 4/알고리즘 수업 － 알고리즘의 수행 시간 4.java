import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		MenOfPassion(A[], n) {
//		    sum <- 0;
//		    for i <- 1 to n - 1
//		        for j <- i + 1 to n
//		            sum <- sum + A[i] × A[j]; # 코드1
//		    return sum;
//		}
		// 입력 7일 때.
		// i = 1~6 / j = i+1~n
		// i=1 -> j=2,3,4,5,6,7  6번
		//   2 -> 	3,4,5,6,7	 5번     ==> ........ i=6 -> 7 1번
		// => 실행횟수 = 1~(n-1) 까지의 합.
		long sum = 0;	// 입력 값이 클 경우 int 범위를 초과할 수 있음...
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		for(int i=1; i<n; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println(2);
	}

}
