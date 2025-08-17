import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		star10();
	}

	// 결과 별 출력하기 위한 배열
	static char[][] star;
	
	public static void star10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// N 입력
		int n = Integer.parseInt(br.readLine());
		
		// 결과 배열 크기 지정
		star = new char[n][n];
		// 초기화
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				star[i][j] = ' ';
			}
		}
		
		// (0,0)부터 별 찍기.
		add(0, 0, n);
		
		// 출력
		for(int i=0; i<n; i++) {
//			bw.write(star[i]+"\n");	=> 배열의 주소가 출력되버림...
			bw.write(star[i]);
			bw.newLine();
		}
		
		bw.close();
		br.close();
	}
	
	public static void add(int x, int y, int size) {
		if(size == 1) {
			// 1이면 별 1개.
			star[x][y] = '*';
			return;
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(i==1 && j==1) {
					// 가운데는 공백
					continue;
				}
				
				add(x+i*(size/3), y+j*(size/3), size/3);
			}
		}
	}
}
