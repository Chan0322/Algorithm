import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		rememberWord();
	}

	public static void rememberWord() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 단어 개수
		int n = Integer.parseInt(st.nextToken());
		// 단어 길이
		int m = Integer.parseInt(st.nextToken());
		
		// 단어의 사용 횟수 저장하기 위한 Map
		Map<String, Integer> map = new HashMap<>();
		
		//단어 입력 및 저장
		for(int i=0; i<n; i++) {
			String word = br.readLine();
			if(word.length()>=m	) {
				// 길이가 m 이상인 단어만 저장
				map.put(word, map.getOrDefault(word, 0)+1);
			}
		}
		
		// 자주나오고, 길이가 길고, 알파벳이 우선인 순서로 정렬
		List<String> list = new ArrayList<>(map.keySet());
		list.sort((word1, word2) -> {
			int cnt1 = map.get(word1);
			int cnt2 = map.get(word2);
			if(cnt1 != cnt2) { return cnt2 - cnt1; }	// 많이 사용된 순
			if(word1.length() != word2.length()) { return word2.length() - word1.length(); }  // 길이순
			return word1.compareTo(word2);	// 알파벳 순
		});
		
		for(String word : list) {
			bw.write(word+"\n");
		}
		bw.close();
		br.close();
	}
}
