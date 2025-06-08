import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		chess();
	}
	
	public static void chess() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 흰색 피스
		int white[] = new int[6];
		// 검정 피스
		int black[] = new int[6];
		black[0] = 1;	// 킹
		black[1] = 1;	// 퀸
		black[2] = 2;	// 룩
		black[3] = 2;	// 비숍
		black[4] = 2;	// 나이트
		black[5] = 8;	// 폰
		
		// 결과 저장 배열
		int res[] = new int[6];
		
		// 흰색 피스 입력
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<white.length; i++) {
			white[i] = Integer.parseInt(st.nextToken());
//			System.out.print(white[i]+" ");
		}
		
		// 흰색/검정 비교
		for(int i=0; i<white.length; i++) {
			// 검정과 화이트의 갯수가 맞지 않으면 그 차이를 결과 배열에 저장
			if(black[i] != white[i]) {
				res[i] = black[i] - white[i];
			}
		}
		
		// 결과 출력
		for(int i=0; i<res.length; i++) {
			bw.write(res[i]+" ");
		}
		bw.close();
		
	}

}
