import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Card2();
	}

	public static void Card2() throws NumberFormatException, IOException {
		// 규칙 : 홀수번째 일 때 맨 위의 카드 제거. 짝수번째일 때 맨 위의 카드 맨 밑으로...
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		// 큐
		Deque<Integer> q = new ArrayDeque<>();
		
		// 큐에 카드 저장.
		int i=1;
		while(i<=n) {
			q.offer(i);
			i++;
		}
		
		// 카드 1개가 남을 때까지 반복
		int cnt=1;
		while(q.size()>1) {
			// 홀수 번째에는 카드 제거. 짝수 번째에는 카드 맨 밑으로...
			if(cnt%2 == 1) {
				// 홀수 번째이면
				q.pop();
				cnt++;
			}else if(cnt%2 == 0) {
				//짝수 번째이면
				q.offer(q.pop());
				cnt++;
			}
		}
		
		// 마지막 남은 카드
		bw.write(q.pop()+"");
		bw.close();
		br.close();
	}
}
