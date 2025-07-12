import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		personInCompany();
	}

	public static void personInCompany() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 출입 기록 수
		int n = Integer.parseInt(br.readLine());
		
		// 출입 기록 맵에 저장. => 동일한 키 값에 입력된 value 들은 마지막 value만 저장됨! => 출입 기록 반영 가능
		Map<String, String> person = new HashMap<>();
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			person.put(st.nextToken(), st.nextToken());	// Key : 직원 이름, Value : 출입 기록
		}
		
		//사전 역순으로 조회하기 위해 리스트에 키 값을 담아 정렬
		List<String> key = new ArrayList<>(person.keySet());
		//Collections.reverse(key); 	// 역순 정렬 => 오답. keySet은 정렬되있지 않은 순서로 반환됨. 정렬작업 필요. => reverse 해도 의미 없음
		/*
		Collections.sort(key, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		*/
		// 위 코드와 아래 코드 동일!
		Collections.sort(key, Collections.reverseOrder());	// 리스트 key를 내림차순을 기준으로 정렬하겠다!
		
		// 회사에 남은 직원만 출력
		for(int i=0; i<key.size(); i++) {
			// 리스트에 담은 키 값을 이용하여 맵의 value 값을 읽어와, value가 enter인 키 값만 출력
			if(person.get(key.get(i)).equals("enter")) {
				bw.write(key.get(i)+"\n");
			}else {
				continue;
			}
		}
		
		bw.close();
		br.close();
	}
}
