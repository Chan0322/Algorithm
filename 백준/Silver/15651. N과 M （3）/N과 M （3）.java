import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		nAndM();
		System.out.println(sb);
	}

	static int n, m;
	static int[] res;
	static StringBuilder sb = new StringBuilder();
	
	public static void nAndM() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// n m 입력
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		// 수열 저장 위함
		res = new int[m];
		
		backtracking(0);
	}
	
	public static void backtracking(int depth) {
		if(depth == m)	{
			// m개를 골랐으면 출력
			for(int i=0; i<m; i++) {
//				System.out.print(res[i]+" ");  시간초과
				sb.append(res[i]).append(" ");
			}
			sb.append("\n");
//			System.out.println();
			return;
		}
		
		for(int i=1; i<=n; i++	) {
			res[depth] = i;
			backtracking(depth+1);
		}
	}
}
