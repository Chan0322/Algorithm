import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		snail();
	}

	public static void snail() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		int moveDay = a-b; // 하루 이동 거리
		int lastDay = v-b; // 목적지 도착 후 미끄러지지 않음.
		int cnt = lastDay / moveDay; // 이동하는 데 걸린 일 수
		
		if(lastDay%moveDay != 0) {
			// 나머지가 있으면 막대를 다 올라가지 못한 것.
			cnt++;  // 하루 추가.
		}
		bw.write(cnt+"");
		bw.close();
	}
}
