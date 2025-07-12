import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		whoAreYou();
	}

	public static void whoAreYou() throws IOException {
		// 중복 없으므로 둘다 Set으로 저장 set은 중복을 자동으로 제거해줌!
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 듣도 못한 사람, 보도 못한 사람 입력 받을 수.
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		// 듣도 못한 사람, 보도 못한 사람 저장
		Set<String> noHear = new HashSet<>();
		Set<String> noSee = new HashSet<>();
		
		for(int i=0; i<n; i++) {
			noHear.add(br.readLine());
		}
		for(int i=0; i<m; i++) {
			noSee.add(br.readLine());
		}
		
		// 듣보잡 저장하기 위한 리스트 (사전 순 정렬해야 하므로 리스트로)
		List<String> res = new ArrayList<>();
		
		// 듣보잡 조회
		// Set에서 하나씩 가져오기 위해 Iterator 사용
		Iterator<String> it = noHear.iterator();
		while(it.hasNext()) {
			// 듣도 못한 사람 한명씩 가져와 스트링 저장.
			String person = it.next();
			
			if(noSee.contains(person)) {
				// 듣도 못한 사람이 보도 못한 사람에 존재하면, 리스트에 저장.
				res.add(person);
			}else {
				continue;
			}
		}
		
		// 정렬
		Collections.sort(res);
		
		//출력
		bw.write(res.size()+"\n");	// 듣보잡 인원 수
		for(int i=0; i<res.size(); i++) {
			bw.write(res.get(i)+"\n");
		}
		
		bw.close();
		br.close();
	}
}
