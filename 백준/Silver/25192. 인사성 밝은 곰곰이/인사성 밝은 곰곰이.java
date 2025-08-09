import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		gomGomHello();
	}

	public static void gomGomHello() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 채팅 기록 수
		int n = Integer.parseInt(br.readLine());
		
		// ENTER 후 처음 입장 시에만 인사. => SET으로 중복 제거해 카운트.
		Set<String> member = new HashSet<>();
		
		// 곰곰티콘 사용 횟수 카운트
		int cnt = 0;
		
		//n번 입력
		for(int i=0; i<n; i++) {
			String user = br.readLine();
			if(user.equals("ENTER")) {
				// ENTER 입력 시 SET 초기화
				member.clear();
			}else {
				// set에 유저 저장.
				if(!member.contains(user)) {
					member.add(user);
					cnt++;
				}
			}
		}
		
		// 출력
		bw.write(cnt+"");
		bw.close();
		br.close();
	}
}
