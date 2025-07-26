import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		stack2();
	}

	public static void stack2() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 스택 생성
		Stack<Integer> stack = new Stack<>();

		// 명령 수
		int n = Integer.parseInt(br.readLine());

		// 반복
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			switch (st.nextToken()) {
			case "1":
				// push => 스택 맨 위에 요소 추가
				stack.push(Integer.parseInt(st.nextToken()));
				break;
			case "2":
				int tmp = 0;
				if(stack.isEmpty()) {
					tmp = -1;
				}else {
					// pop => 스택 맨 위의 요소를 제거하고 리턴
					tmp = stack.pop();
				}
				bw.write(tmp+"\n");
				break;
			case "3":
				bw.write(stack.size()+"\n");
				break;
			case "4":
				if(stack.isEmpty()) {
					tmp = 1;
				}else {
					tmp = 0;
				}
				bw.write(tmp+"\n");
				break;
			case "5":
				if(stack.isEmpty()) {
					tmp = -1;
				}else {
					// 스택 맨 위의 요소를 제거하지 않고 리턴만 함.
					tmp = stack.peek();
				}
				bw.write(tmp+"\n");
				break;
			}
		}
		bw.close();
		br.close();
	}
}
