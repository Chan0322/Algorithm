import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		Triangle();
	}

	public static void Triangle() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			// 세 변 길이 저장
			int nArr[] = new int[3];
			
			nArr[0] = Integer.parseInt(st.nextToken());
			nArr[1] = Integer.parseInt(st.nextToken());
			nArr[2] = Integer.parseInt(st.nextToken());
			
			if(nArr[0]==0 && nArr[1]==0 && nArr[2]==0) {
				// 0 0 0 입력 시 종료
				break;
			}
			Arrays.sort(nArr); // 오름차순 정렬
			if(nArr[2] >= (nArr[0]+nArr[1])) {
				bw.write("Invalid\n");
			}else {
				// 삼각형의 조건을 만족할 경우
				if(nArr[0]==nArr[1] && nArr[0]==nArr[2] && nArr[1]==nArr[2]) {
					// 세 변의 길이 모두 같음.
					bw.write("Equilateral\n");
				}else if(nArr[0]==nArr[1] || nArr[0]==nArr[2] || nArr[1]==nArr[2]) {
					// 두 변의 길이 같음
					bw.write("Isosceles\n");
				}else if(nArr[0]!=nArr[1] && nArr[0]!=nArr[2] && nArr[1]!=nArr[2]) {
					// 세 변 모두 다름
					bw.write("Scalene\n");
				}
			}
		}
		bw.close();
		br.close();
	}
}
