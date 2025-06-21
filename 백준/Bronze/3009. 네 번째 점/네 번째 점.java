import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		findDot();
	}

	public static void findDot() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x1 = Integer.parseInt(st.nextToken());
		int y1 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int x2 = Integer.parseInt(st.nextToken());
		int y2 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int x3 = Integer.parseInt(st.nextToken());
		int y3 = Integer.parseInt(st.nextToken());
		
		// 구하는 좌표
		int x=0;
		int y=0;
		
		// x축 2개가 같으면 나머지 좌표와 x축이 같아야 함.
		if(x1 == x2) {
			x = x3;
		}else if(x1 == x3) {
			x = x2;
		}else if(x2 == x3) {
			x = x1;
		}
		
		// y축 2개가 같으면 나머지 좌표와 y축 같음.
		if(y1 == y2) {
			y = y3;
		}else if(y1 == y3) {
			y = y2;
		}else if(y2 == y3) {
			y = y1;
		}
		
		bw.write(x + " " + y);
		bw.close();
		br.close();
	}
}
