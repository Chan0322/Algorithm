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
		Balloon();
	}

	public static void Balloon() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 풍선 수
		int n = Integer.parseInt(br.readLine());
		
		// 풍선에 넣을 카드 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 덱
		Deque<Balloon> deck = new ArrayDeque<>();

		// 풍선 번호와 이동 거리 저장.
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(st.nextToken());
			deck.add(new Balloon(i+1, num));
		}
		
		// 1번 풍선 제거
		Balloon ball = deck.removeFirst();
		// 삭제한 풍선은 따로 저장. => 풍선 안에 든 카드 정보 읽기 위함.
		bw.write(ball.idx+" ");
		
		// 풍선이 모두 제거될 때까지 반복
		while(!deck.isEmpty()) {
			if(ball.num>0) {
				// 오른쪽으로
				for(int i=1; i<ball.num; i++) {
					// 카드의 적힌 수에 해당하는 풍선을 제거해야 하므로, 그 앞에 있는 풍선들은 맨 뒤로 이동
					deck.addLast(deck.removeFirst());
				}
				// 일치하는 풍선 제거.
				ball = deck.removeFirst();
				bw.write(ball.idx+" ");
			}else {
				// 왼쪽으로
				for(int i=1; i<=Math.abs(ball.num); i++) {
					// 오른쪽일 때와 반대로.
					deck.addFirst(deck.removeLast());
				}
				ball = deck.removeFirst();
				bw.write(ball.idx+" ");
			}
		}
		bw.close();
		br.close();
	}
	
	static class Balloon {
		int idx; // 풍선 번호
		int num; // 이동할 횟수
		
		public Balloon(int idx, int num) {
			super();
			this.idx = idx;
			this.num = num;
		}
	}
}
