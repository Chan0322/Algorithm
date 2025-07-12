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
		numCard();
	}

	public static void numCard() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 상근이가 가진 카드
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Set<Integer> nSet = new HashSet<>();
		for(int i=0; i<n; i++) {
			nSet.add(Integer.parseInt(st.nextToken()));
		}
		
		// 상근이가 가진 카드인지 아닌지 정수
		int m = Integer.parseInt(br.readLine());
		int mArr[] = new int[m];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			mArr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 상근이가 가졌는지 아닌지 비교
		for(int i=0; i<mArr.length; i++) {
			if(nSet.contains(mArr[i])) {
				mArr[i] = 1;
			}else {
				mArr[i] = 0;
			}
		}
		
		// 출력
		for(int i=0; i<mArr.length; i++) {
			bw.write(mArr[i]+" ");
		}
		
		bw.close();
		br.close();
	}
}
