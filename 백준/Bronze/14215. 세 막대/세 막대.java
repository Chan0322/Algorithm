import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		threeSticks();
	}
	
	public static void threeSticks() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 세 정수 저장 배열
		int nArr[] = new int[3];
		
		// 배열에 저장
		for(int i=0; i<3; i++) {
			nArr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 배열 오름차순 정렬
		Arrays.sort(nArr);
		
		int res = 0;
		
		while(true) {
			// 삼각형 조건 만족 시 둘레
			if(nArr[2] < (nArr[0]+nArr[1])) {
				res = nArr[0] + nArr[1] + nArr[2];
				break;
			}else {
				// 삼각형 조건 만족하지 못하면, 제일 긴 막대의 길이 줄임.
				nArr[2]--;
			}
		}
		bw.write(res+"");
		bw.close();
		br.close();
	}
}
