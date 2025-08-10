import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		palin();
	}

	static int cnt;	// 호출 횟수
	
	public static void palin() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//테스트케이스 개수
		int t = Integer.parseInt(br.readLine());
		
		// 문자열 입력 받아 처리
		for(int i=0; i<t; i++) {
			String str = br.readLine();
			int res = isPalindrome(str);
			bw.write(res+" "+cnt+"\n");
		}
		
		bw.close();
		br.close();
		
	}
	public static int isPalindrome(String str) {
		cnt = 0;
		return recursion(str, 0, str.length()-1);
	}
	public static int recursion(String str, int l, int r) {
		cnt++;	// 호출 횟수 증가
		if(l >= r ) {return 1;}
		else if(str.charAt(l) != str.charAt(r)) {return 0;}
		else {return recursion(str, l+1, r-1);}
	}
}