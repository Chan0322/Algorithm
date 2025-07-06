import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		sugar();
	}

	public static void sugar() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int cnt = 0; // 가져가야 할 갯수.
		
		while(true) {
			// 5로 나눠떨어져 나머지가 0 or 5키로, 3키로 모두 빼고 나머지가 0
			if(n%5 == 0) {
				cnt += n/5;
				bw.write(cnt+"");
				break;
			}else {
				// 5로 나눠떨어지지 않으며 3보다 크면
				n -= 3;
				cnt++;
			}
			
			// n이 음수가 되면(3을 빼다가 음수가 되면 뺄수 없다는 뜻)
			if(n<0) {
				bw.write(-1+"");
				break;
			}
		}
		bw.close();
		br.close();
	}
}
