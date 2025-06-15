import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		facOrMul();
	}
	
	public static void facOrMul() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
					
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int n1 = Integer.parseInt(st.nextToken()); //첫번째 숫자
			int n2 = Integer.parseInt(st.nextToken()); // 두 번째 숫자.
	
			if(n1!=0 && n2!=0) {
				if(n2%n1==0) {
					bw.write("factor\n");
				}else if(n1%n2==0) {
					bw.write("multiple\n");
				}else {
					bw.write("neither\n");
				}
			}else {
				break;		// n1과 n2가 0이면 종료
			}
		}
		bw.close();
	}
}
