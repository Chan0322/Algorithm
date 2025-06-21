import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		exitRectangle();
	}

	public static void exitRectangle() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력 받아 공백으로 구분
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());	// 오른쪽 위 x
		int h = Integer.parseInt(st.nextToken());	// 오른쪽 위 y
		
		int res = 0;	// 결과
		
		// 각 변까지의 길이가 가장 짧은 곳
		if((x<=(w-x)) && (x<=y) && (x<=(h-y))) {
			// x까지의 거리가 가장 짧을 때.
			res = x;
		}else if(((w-x)<=x) && ((w-x)<=y) && ((w-x)<=(h-y))) {
			res = w-x;
		}else if((y<=x) && (y<=(w-x)) && (y<=(h-y))) {
			res = y;
		}else if(((h-y)<=y) && ((h-y)<=x) && ((h-y)<=(w-x))) {
			res = h-y;
		}
		
		bw.write(res+"");
		bw.close();
		br.close();
	}
}
