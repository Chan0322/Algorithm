import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		parentheses();
	}

	public static void parentheses() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 테스트케이스 개수
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			String str = br.readLine();	// 입력
			char chArr[] = str.toCharArray();	// 괄호를 하나씩 배열에 저장
			Stack<Character> stack = new Stack<>();	// 입력된 괄호를 하나씩 가져와 확인하기 위한 스택
			boolean vps = true;	// vps 확인 위함
			
			for(int j=0; j<chArr.length; j++) {
				if(chArr[j] == '(') {
					// 여는 괄호는 스택에 저장
					stack.push(chArr[j]);
				}else if(chArr[j]==')') {
					//닫는 괄호이면
					if(stack.isEmpty()) {
						// 스택이 비었을 경우 ( ) 짝을 이루지 못함. => VPS 아님.
						vps = false;
						break;
					}else {
						// 스택에서 여는 괄호 제거 => ( ) 쌍 완료!
						stack.pop();
					}
				}
			}
			// 스택에 여는 괄호가 남아있으면 VPS 아님
			if(!stack.isEmpty()) {
				vps = false;
			}
			
			if(vps) {
				// true이면
				bw.write("YES\n");
			}else {
				// false이면
				bw.write("NO\n");
			}
		}
		br.close();
		bw.close();
	}
}
