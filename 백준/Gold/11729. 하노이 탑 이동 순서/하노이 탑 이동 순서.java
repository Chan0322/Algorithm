import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		hanoi();
	}
	
	static StringBuilder sb = new StringBuilder();
	static int cnt = 0;	// 이동횟수

	public static void hanoi() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 첫번째 원판의 개수
		int n = Integer.parseInt(br.readLine());
		
		moveHanoi(n, 1, 2, 3);
		
		System.out.println(cnt);
		System.out.println(sb.toString());
	}
	
	public static void moveHanoi(int n, int first, int middle, int last) {
		// n : 원판의 개수
		// first : 이동 시작 장대, middle : 임시 장대, last : 이동할 장대
		if(n == 1) {
			sb.append(first).append(" ").append(last).append("\n");
			cnt++;
			return;
		}
		
		//1. n-1개를 임시 장대로 이동
		moveHanoi(n-1, first, last, middle);
		
		//2. 가장 큰 판을 last로
		sb.append(first).append(" ").append(last).append("\n");
		cnt++;
		
		//3. n-1개를 last로
		moveHanoi(n-1, middle, first, last);
	}
}
