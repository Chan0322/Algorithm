import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		zero();
	}

	public static void zero() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// k 입력
		int k = Integer.parseInt(br.readLine());
		
		// 스택 생성
		Stack<Integer> jaemin = new Stack<>();
		
		// k번 반복
		for(int i=0; i<k; i++) {
			int n = Integer.parseInt(br.readLine());
			
			if(n==0) {
				jaemin.pop();
			}else {
				jaemin.push(n);
			}
		}
		// 스택에 남은 수 합
		int sum = 0;
		for(int num : jaemin) {
			sum += num;
		}
		
		bw.write(sum+"");
		bw.close();
		br.close();
	}
}
