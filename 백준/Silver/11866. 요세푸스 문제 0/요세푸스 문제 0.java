import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		JosephusProblem();
	}
	
	public static void JosephusProblem() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		// 큐 생성
		Deque<Integer> q = new ArrayDeque<>();
		
		// 원형 사람들 저장
		int people = 1;
		while(people<=n	) {
			q.offer(people++);
		}
		
		// 출력하기 위해 제거한 사람들 순서대로 배열에 저장
		int[] res = new int[n];
		
		// K번째 사람 제거
		int idx = 0;
		while(!q.isEmpty()) {
			// K번째 사람을 뽑아내 제거해야 함...
			// => k-1까지 있던 사람들(앞에 있는 사람들)을 큐의 맨 뒤로 보낸다.
			// => K번째 사람이 맨 앞에 오게 됨.
			for(int i=1; i<=k-1; i++) {
				q.offer(q.pop());
			}
			// 제거한 사람 배열에 저장.
			res[idx] = q.pop();
			idx++;
		}
		
		// 출력
		bw.write("<");
		for(int i=0; i<res.length-1; i++) {
			bw.write(res[i]+", ");
		}
		bw.write(res[res.length-1]+">");
		bw.close();
		br.close();
	}
}
