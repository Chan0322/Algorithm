import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		facSum();
	}

	public static void facSum() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			// -1 입력 시 종료.
			if(n == -1) {
				break;
			}else {
				// 약수 갯수 카운트 (배열 생성 위함)
				int cnt = 0;
				for(int i=1; i<=n; i++) {
					if(n%i == 0) {
						cnt++;
					}
				}
				// 약수 저장할 배열 생성
				int facArr[] = new int[cnt];
				//배열에 약수 저장
				int index=0;
				for(int i=1; i<=n; i++) {
					if(n%i == 0) {
						facArr[index++] = i;
					}
				}
				
				// 자기자신을 제외한 약수의 합 구하기
				int sum = 0;
				for(int i=0; i<facArr.length; i++) {
					if(facArr[i] != n) {
						sum += facArr[i];
					}
				}
				
				// 완전수인지 확인하고 출력
				if(sum == n) {
					// 완전수일 경우
					bw.write(n+" = ");
					for(int i=0; i<facArr.length-1; i++) {
						// 자기 자신을 제외한 나머지 약수 출력
						if(i == facArr.length-2) {
							bw.write(facArr[i]+"\n");
						}else {
							bw.write(facArr[i]+" + ");
						}
					}
				}else {
					// 완전수 X
					bw.write(n+" is NOT perfect.\n");
				}
			}
		}
		bw.close();
	}
}