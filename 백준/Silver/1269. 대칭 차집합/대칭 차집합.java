import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		diff();
	}

	public static void diff() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		//집합 a의 원소 갯수, b의 원소 갯수 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		// 집합 A , B 생성후 각각 원소 입력
		st = new StringTokenizer(br.readLine());
		Set<Integer> aSet = new HashSet<>();
		for(int i=0; i<a; i++) {
			aSet.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine());
		Set<Integer> bSet = new HashSet<>();
		for(int i=0; i<b; i++) {
			bSet.add(Integer.parseInt(st.nextToken()));
		}
		
		//A-B 인 경우
		Set<Integer> AsubB = new HashSet<>(aSet);
		AsubB.removeAll(bSet);	// a에서 b의 값 제거.
		
		//B-A 인 경우
		Set<Integer> BsubA = new HashSet<>(bSet);
		BsubA.removeAll(aSet);	// b에서 a의 값 제거.
		
		// 대칭 차집합 원소 갯수
		bw.write(AsubB.size()+BsubA.size()+"");
		bw.close();
		br.close();
	}
}
