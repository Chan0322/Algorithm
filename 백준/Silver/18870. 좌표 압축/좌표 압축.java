import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		CoordinateCompression();   시간 초과
		CoordinateCompression2();
	}

	public static void CoordinateCompression2() throws NumberFormatException, IOException {
		//수의 범위가 매우 큰 상태에서 수의 값과 상관 없이 숫자 간의 대소관계만 알면 될 때 이용하는 알고리즘
        // => 각 원소의 순위를 매김!
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		//입력값 원본 저장
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		// 결과 값을 저장하기 위한 Set. Set은 중복 제거 자동으로 진행됨!
		Set<Integer> intSet = new HashSet<>();
		for(int i=0; i<n; i++) {
			intSet.add(arr[i]);
		}
		//오름차순 정렬하기 위해 리스트에 저장
		List<Integer> intList = new ArrayList<>(intSet);
		Collections.sort(intList);
		
		// Map을 이용하여 순위 매기기
		Map<Integer, Integer> intMap = new HashMap<>();
		for(int i=0; i<intList.size(); i++) {
			intMap.put(intList.get(i), i);
		}
		// 원본 배열과 비교해 순위 값 출력
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<arr.length; i++) {
			sb.append(intMap.get(arr[i])).append(" ");
		}
		
		bw.write((sb+"").trim());
		bw.close();
		br.close();
	}
	
	// 시간 초과... 이중 반복문 사용 때문?
	/*
	public static void CoordinateCompression() throws NumberFormatException, IOException {
		//수의 범위가 매우 큰 상태에서 수의 값과 상관 없이 숫자 간의 대소관계만 알면 될 때 이용하는 알고리즘
        // => 각 원소의 순위를 매김!
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		//입력값 원본 저장
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 결과 값을 저장하기 위한 Set. Set은 중복 제거 자동으로 진행됨!
		Set<Integer> intSet = new HashSet<>();
		for(int i=0; i<n; i++) {
			intSet.add(arr[i]);
		}
		//오름차순 정렬하기 위해 리스트에 저장
		List<Integer> intList = new ArrayList<>(intSet);
		//오름차순 정렬
		Collections.sort(intList, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		});
//		for(int i=0; i<intList.size(); i++) {
//			System.out.println(intList.get(i));
//		}
		
		// 정렬된 리스트를 기준으로, 원본 배열과 비교하여 인덱스 값을 원본 배열에 저장
		for(int i=0; i<intList.size(); i++) {
			// 리스트 기준으로
			for(int j=0; j<arr.length; j++) {
				//원본 배열을 확인하며
				if(intList.get(i) == arr[j]) {
					// 리스트와 배열의 값이 일치하면, 해당 리스트의 인덱스를 일치하는 배열의 위치에 저장.
					arr[j] = i;
				}
			}
		}
		
		//출력 StringBuilder
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<arr.length-1; i++) {
			sb.append(arr[i]).append(" ");
		}
		sb.append(arr[arr.length-1]);
		bw.write(sb+"");
		
		// 출력 => BufferedWriter 시간 초과!
//		for(int i=0; i<arr.length-1; i++) {
//			bw.write(arr[i]+" ");
//		}
//		bw.write(arr[arr.length-1]+"");
//		
		bw.close();
		br.close();
	}
	*/
}
