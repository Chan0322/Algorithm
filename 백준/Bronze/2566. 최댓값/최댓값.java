import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		maxItem();
	}

	public static void maxItem() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int arr[][] = new int[9][9];
		
		int max = 0; // 최댓값
		int row = 1; // 열
		int col = 1; // 행
		
		for(int i=0; i<arr.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				
				if(max<arr[i][j]) {
					max = arr[i][j];
					row = i+1;
					col = j+1;
				}
			}
		}
		
		bw.write(max + "\n" + row + " " + col);
		bw.close();
	}
}
