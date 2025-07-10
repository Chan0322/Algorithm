import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		sortWord();
		//sortWord2();
	}

	public static void sortWord() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String sArr[] = new String[n];
		
		for(int i=0; i<n; i++) {
			sArr[i] = br.readLine();
		}
		
		Arrays.sort(sArr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) {
					// 길이가 같으면
					return o1.compareTo(o2);
				}else {
					// 길이가 다르면
					return o1.length() - o2.length();
				}
			}
		});
		
		// 중복 제거하며 출력
		bw.write(sArr[0]+"\n");
		for(int i=1; i<n; i++) {
			if(!sArr[i].equals(sArr[i-1])) {
				bw.write(sArr[i]+"\n");
			}
		}
		bw.close();
		br.close();
	}
	/////////////////////////////////////////////////////////////////////////
	// 방법2
	public static void sortWord2() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		Set<String> word = new HashSet<>();	// 자동으로 중복 제거 가능해짐!
		for(int i=0; i<n; i++) {
			word.add(br.readLine());
		}
		
		// Set은 순서가 없으므로 정렬하기 위해 List로 변경
		List<String> words = new ArrayList<>(word);
		
		// 정렬
		Collections.sort(words, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) {
					// 길이 같으면 사전 순으로
					return o1.compareTo(o2);
				}else {
					// 길이 짧은 순으로
					return o1.length() - o2.length();
				}
			}
		});
		
		// 출력
		for(int i=0; i<words.size(); i++) {
			bw.write(words.get(i)+"\n");
		}
		bw.close();
		br.close();
	}
}
