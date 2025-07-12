import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		stringArrSet();
	}
	
	public static void stringArrSet() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//n, m 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());	// 집합 S에 포함될 문자열
		int m = Integer.parseInt(st.nextToken());	// 검사할 문자열
		
		// 집합 s에 저장
		Set<String> sSet = new HashSet<>();
		for(int i=0; i<n; i++) {
			sSet.add(br.readLine());
		}
		
		// 검사할 문자열을 배열에 저장
		String[] sArr = new String[m];
		for(int i=0; i<m; i++) {
			sArr[i] = br.readLine();
		}
		
		int cnt = 0;	// 몇개 포함되었는지 저장할 변수
		
		// 비교
		for(int i=0; i<sArr.length; i++) {
			if(sSet.contains(sArr[i])) {
				cnt++;
			}else {
				continue;
			}
		}
		
		bw.write(cnt+"");
		bw.close();
		br.close();
	}

}
