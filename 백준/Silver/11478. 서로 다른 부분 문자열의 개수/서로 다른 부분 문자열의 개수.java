import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		otherString();
	}

	public static void otherString() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 문자열 입력
		String s = br.readLine();
		
		// Set에 문자열 쪼개며 저장 => 중복된 값은 알아서 제거됨
		Set<String> str = new HashSet<>();
		for(int i=0; i<s.length(); i++) {
			// 앞에서부터 한 글자씩 접근하고,
			for(int j=i+1; j<=s.length(); j++) {
				// i에서부터 j까지 문자열 잘라서 저장. 이때, i부터 시작해 j 값의 이전 인덱스까지만 접근함.
				str.add(s.substring(i, j));
			}
		}
		
		bw.write(str.size()+"");
		bw.close();
		br.close();
	}
}
