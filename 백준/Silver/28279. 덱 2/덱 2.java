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
		Deck2();
	}

	public static void Deck2() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 명령 수
		int n = Integer.parseInt(br.readLine());
		
		// 덱 생성
		Deque<Integer> deck = new ArrayDeque<>();
		
		for(int i=0; i<n; i++) {
			// 입력
			StringTokenizer st = new StringTokenizer(br.readLine());
			int command = Integer.parseInt(st.nextToken());
			
			switch (command) {
			case 1:
				deck.addFirst(Integer.parseInt(st.nextToken()));
				break;
			case 2:
				deck.addLast(Integer.parseInt(st.nextToken()));
				break;
			case 3:
				bw.write((deck.isEmpty()?-1:deck.removeFirst())+"\n");
				break;
			case 4:
				bw.write((deck.isEmpty()?-1:deck.removeLast())+"\n");
				break;
			case 5:
				bw.write(deck.size()+"\n");
				break;
			case 6:
				bw.write((deck.isEmpty()?1:0)+"\n");
				break;
			case 7:
				bw.write((deck.isEmpty()?-1:deck.getFirst())+"\n");
				break;
			case 8:
				bw.write((deck.isEmpty()?-1:deck.getLast())+"\n");
				break;
			}
		}
		bw.close();
		br.close();
	}
}
