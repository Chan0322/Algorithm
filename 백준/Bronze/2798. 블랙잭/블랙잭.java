import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BlackJack();
	}
	
	public static void BlackJack() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());	// 카드의 개수
		int m = Integer.parseInt(st.nextToken());
		
		int card[] = new int[n];
		st = new StringTokenizer(br.readLine());
		
		// 각 카드의 값 배열 저장
		for(int i=0; i<card.length; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		
		int res=0;
		int sum=0;
		// 3중 for문으로 모든 경우의 수 계산
		for(int i=0; i<n-2; i++) {
			for(int j=i+1; j<n-1; j++) {
				for(int k=j+1; k<n; k++) {
					sum = card[i] + card[j] + card[k];
					
					if(sum==m) {
						bw.write(sum+"");
						bw.close();
						br.close();
						return;
					}
					
					if(sum<m && sum>res) {
						res = sum;
					}
				}
			}
		}
		bw.write(res+"");
		bw.close();
		br.close();
	}
}
