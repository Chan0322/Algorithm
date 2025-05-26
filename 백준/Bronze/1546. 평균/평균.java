import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		chgScore();
	}

	public static void chgScore() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());		// 과목 수
		double subject[] = new double[N];		// 과목 담을 배열
		double max = 0;
		double sum = 0;
		double avg = 0;
		// 과목별 점수 입력 받고 배열에 저장.
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<subject.length; i++) {
			subject[i] = Integer.parseInt(st.nextToken());
			
			// 최고 점수 찾기.
			if(max<subject[i]) {
				max = subject[i];
			}
		}
		
		for(int i=0; i<subject.length; i++) {
			// 점수 사기치기
			subject[i] = (subject[i]/max)*100;
			
			// 평균 구하기
			sum += subject[i];
		}
		avg = sum/N;		
		bw.write(avg+"");
		bw.close();
	}
}
