import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		readArr();
	}

	public static void readArr() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char arr[][] = new char[5][15];
		String str = "";
		
		for(int i=0; i<arr.length; i++) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = br.readLine();
//			for(int j=0; j<arr[i].length; j++) {
			for(int j=0; j<s.length(); j++) {
//				arr[i][j] = st.nextToken();
				arr[i][j] = s.charAt(j);
			}
		}
		
		for(int i=0; i<15; i++) {
			for(int j=0; j<5; j++) {
				if(arr[j][i] != 0) { // char 는 null 사용 불가!(원시형) => 아스키 코드이용. 0이 null
					str+=arr[j][i];
				}
			}
		}
		
		bw.write(str);
		bw.close();
	}
}
