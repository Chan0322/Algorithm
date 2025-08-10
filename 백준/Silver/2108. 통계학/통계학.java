import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		statistics();
	}

	public static void statistics() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 수의 개수
		int n = Integer.parseInt(br.readLine());
		
		// 입력 받은 수 저장하기 위한 배열
		int[] arr = new int[n];
		
		// 최빈값 구하기 위함. => 숫자별 사용 횟수 저장
		Map<Integer, Integer> cnt = new HashMap<>();
		
		// 배열에 저장
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			cnt.put(arr[i], cnt.getOrDefault(arr[i], 0) + 1);
		}
		
		// 정렬
		Arrays.sort(arr);
		
		// 산술 평균
		int avg = 0;
		for(int i=0; i<arr.length; i++) {
			avg += arr[i];
		}
		// 평균 계산
		avg = Math.round((float)avg/arr.length);
		bw.write(avg+"\n");
		
		// 중간 값
		bw.write(arr[n/2]+"\n");
		
		// 최빈값
		int max = Collections.max(cnt.values());	// 가장 많이 사용된 횟수
		List<Integer> list = new ArrayList<>();		// 최빈값 저장 위함.
		for(Map.Entry<Integer, Integer> entry : cnt.entrySet()) {
			if(entry.getValue() == max) {
				list.add(entry.getKey());
			}
		}
		Collections.sort(list);
		bw.write((list.size()>1?list.get(1):list.get(0))+"\n");
		
		//범위
		bw.write((arr[n-1]-arr[0])+"");
		
		bw.close();
		br.close();
	}
}
