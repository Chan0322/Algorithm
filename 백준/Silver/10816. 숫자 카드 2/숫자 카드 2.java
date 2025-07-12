import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		numCard2();
	}

	public static void numCard2() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 상근쓰 숫자 카드 갯수
		int n = Integer.parseInt(br.readLine());
		// 상근쓰가 가진 숫자 카드의 정수
		StringTokenizer st = new StringTokenizer(br.readLine());
		Map<Integer, Integer> sangMap = new HashMap<>(); 	// 키 : 숫자 카드 정수, value : 중복된 카드 갯수
		
		/*
		for(int i=0; i<n; i++) {
			int key = Integer.parseInt(st.nextToken());
			// 카드 정수를 하나씩 읽어와서
			if(sangMap.containsKey(key)) {
				// 맵에 해당 정수 키 값이 존재하면
				// 해당 키 값에 맞는 value 값을 가져와 갯수 1 증가.
				sangMap.put(key, sangMap.get(key)+1);
			}else {
				// 키 값이 존재하지 않으면, 첫 번째 카드임!
				sangMap.put(key, 1);
			}
		}
		*/
		// 위 코드를 아래와 같이,getOrDefault 메소드를 사용해 간단히 사용 가능하다! => 키가 존재하지 않을 경우 기본 값.
		for(int i=0; i<n; i++) {
			int key = Integer.parseInt(st.nextToken());
			// 카드 정수를 하나씩 읽어와서
			sangMap.put(key, sangMap.getOrDefault(key, 0)+1);	// 키 값이 존재하면 해당 value+1, 존재하지 않으면 0+1 => 첫 번째 값!
		}
		
		int m = Integer.parseInt(br.readLine());	// 상근이가 가졌는지 확인하고 싶은 카드 수
		// 찾고 싶은 카드 저장.
		st = new StringTokenizer(br.readLine());
		int findArr[] = new int[m];
		for(int i=0; i<m; i++) {
			findArr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 상근쓰 카드와 비교!
		for(int i=0; i<findArr.length; i++) {
			if(sangMap.containsKey(findArr[i])) {
				// 일치하는 키 값(카드 번호)를 갖고 있으면 해당 카드의 갯수를 배열에 다시 저장..
				findArr[i] = sangMap.get(findArr[i]);
			}else {
				// 일치하는 카드가 없으면 배열에 0 저장.
				findArr[i] = 0;
			}
		}
		
		// 출력
		for(int i=0; i<findArr.length; i++) {
			bw.write(findArr[i]+" ");
		}
		
		bw.close();
		br.close();
	}
}
