import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		decimal();
	}

	public static void decimal() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		int sum = 0;
		int cnt = 0; // 소수 개수 카운트
		
		// 소수 갯수 구하기
		for(int i=m; i<=n; i++) {
			if(i<2) {continue;}	// 0, 1은 소수 X
			
			boolean decimal = true;
			
			for(int j=2; j<i; j++) {
				if(i%j == 0) {
					decimal = false;
					break;	// 소수가 아님
				}
			}
			if(decimal) {
				// 소수일 경우
				sum += i;	// 합 구하기
				cnt++; //소수 개수 카운트
			}
		}
		
		// 소수 저장할 배열
		int decArr[] = new int[cnt];
		
		// 배열에 소수 저장
		int index = 0;
		for(int i=m; i<=n; i++) {
			if(i<2) {continue;}	// 소수 X
			boolean decimal = true;
			for(int j=2; j<i; j++) {
				if(i%j == 0) {
					// 소수 아님
					decimal = false;
					break;
				}
			}
			if(decimal) {
				// 소수 이면
				decArr[index++] = i;
			}
		}
		
		// 출력 (합, 최솟값(배열의 첫번쨰)
		if(cnt==0) {
			bw.write(-1+"\n");
		}else {
			bw.write(sum+"\n"+decArr[0]);
		}
		bw.close();	
	}
}
