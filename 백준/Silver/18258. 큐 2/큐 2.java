import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Queue2();
	}

	public static void Queue2() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 명령 수
		int n = Integer.parseInt(br.readLine());
		
		// 큐
		Deque<Integer> q = new ArrayDeque<>();
		
		// n 번 반복
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String command = st.nextToken();
			
			switch (command) {
			case "push":
				q.offer(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				bw.write((q.isEmpty()?-1:q.pop()) + "\n");
				break;
			case "size":
				bw.write(q.size()+"\n");
				break;
			case "empty":
				bw.write((q.isEmpty()?1:0)+"\n");
				break;
			case "front":
				bw.write((q.isEmpty()?-1:q.peek())+"\n");
				break;
			case "back":
				bw.write((q.isEmpty()?-1:q.peekLast())+"\n");
				break;
			}
		}
		bw.close();
		br.close();
	}
}
