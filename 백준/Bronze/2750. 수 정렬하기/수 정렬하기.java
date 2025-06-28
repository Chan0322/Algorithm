import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int nArr[] = new int[n];
		
		// 배열에 n 개의 정수 저장.
		for(int i=0; i<n; i++) {
			nArr[i] = sc.nextInt();
		}
		
		// 정렬
		for(int i=0; i<nArr.length; i++	) {
			for(int j=i+1; j<nArr.length; j++) {
				int tmp = 0;
				if(nArr[i]>nArr[j]) {
					tmp = nArr[i];
					nArr[i] = nArr[j];
					nArr[j] = tmp;
				}
			}
			// 출력
			System.out.println(nArr[i]);
		}
		
	}
}
