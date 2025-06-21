import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		limLand();
	}

	public static void limLand() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int xArr[] = new int[n];	// x축 저장
		int yArr[] = new int[n];	// y축 저장
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			xArr[i] = Integer.parseInt(st.nextToken());
			yArr[i] = Integer.parseInt(st.nextToken());
		}
		
		int xMax = -10000;
		int xMin = 10000;
		int yMax = -10000;
		int yMin = 10000;
		// 각 좌표축의 최대, 최솟값 구하기
		for(int i=0; i<n; i++) {
			if(xMax <= xArr[i]) {
				xMax = xArr[i];
			}
			
			if(xMin >= xArr[i]) {
				xMin = xArr[i];
			}
			
			if(yMax <= yArr[i]) {
				yMax = yArr[i];
			}
			
			if(yMin >= yArr[i]) {
				yMin = yArr[i];
			}
		}
		
		int width = xMax - xMin;	// 가로
		int height = yMax - yMin;	// 세로
		long area = width * height;	// 넓이
		//System.out.println(xMax + " " + xMin + " " + yMax + " " + yMin);
		bw.write(area+"");
		bw.close();
		br.close();
	}
}
