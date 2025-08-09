import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		chongChong();
	}

	public static void chongChong() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 사람들이 만난 기록 수
		int n = Integer.parseInt(br.readLine());
		
		// 춤추는 사람을 저장하기 위한 Set. 중복 방지
		Set<String> person = new HashSet<>();
		
		// 총총이는 이미 추고 있음
		person.add("ChongChong");
		
		// n 번 반복
		for(int i=0; i<n; i++) {
			// 두 사람 입력
			StringTokenizer st = new StringTokenizer(br.readLine());
			String p1 = st.nextToken();
			String p2 = st.nextToken();
			
			// 만약 한 사람이 춤 추는 중이면 set에 저장
			if(person.contains(p1) || person.contains(p2)) {
				person.add(p1);
				person.add(p2);
			}
		}
		
		bw.write(person.size()+"");
		bw.close();
		br.close();
	}
}
