import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		balanceWorld();
	}

	public static void balanceWorld() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// . 입력 전까지 반복
		while(true) {
			String str = br.readLine();
			
			// . 입력 시 종료
			if(str.equals(".")) {
				break;
			}
			
			// 스택을 통해 ( ), [ ] 쌍 확인.
			Stack<Character> stack = new Stack<>();
			
			// 입력 받은 문자열 배열로 저장
			char ch[] = str.toCharArray();
			
			// vps인지 확인하기 위한 boolean
			boolean vps = true;
			
			for(int i=0; i<ch.length; i++) {
				if(ch[i]=='(' || ch[i]=='[') {
					// 열린 괄호이면 스택에 저장
					stack.push(ch[i]);
				}else if(ch[i]==')') {
					//닫힌 괄호면
					if(stack.isEmpty() || stack.peek() != '(') {
						// 스택이 비었거나 여는 괄호가 없으면 vps 아님.
						vps = false;
						break;
					}else {
						// 스택에서 여는 괄호 제거.
						stack.pop();
					}
				}else if(ch[i]==']') {
					if(stack.isEmpty() || stack.peek() != '[') {
						vps = false;
						break;
					}else {
						stack.pop();
					}
				}
			}
			if(!stack.isEmpty()) {
				vps = false;
			}
			
			if(vps) {
				bw.write("yes\n");
			}else {
				bw.write("no\n");
			}
		}
		bw.close();
		br.close();
	}
}
