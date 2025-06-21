import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		cutline();
	}

	public static void cutline() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());	// 응시자 수
		int k = Integer.parseInt(st.nextToken()); 	// 수상자 수
		
		st = new StringTokenizer(br.readLine());
		int score[] = new int[n];
		// 배열에 저장
		for(int i=0; i<n; i++) {
			score[i] = Integer.parseInt(st.nextToken());
		}
		
		// 점수 배열 정렬 (오름차순)
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(score[i]>score[j]) {
					int tmp = score[i];
					score[i] = score[j];
					score[j] = tmp;
				}
			}
			//System.out.println(score[i]);
		}
		
		bw.write(score[n-k]+"");
		bw.close();
		br.close();
	}
}
