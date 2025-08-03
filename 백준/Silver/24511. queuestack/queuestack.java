import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		QueueStack();
		QueueStack2();
	}

	public static void QueueStack2() throws NumberFormatException, IOException {
		// 스택인 경우엔 저장할 필요 없이 바로 출력.. 큐인 경우에만 저장
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 자료구조의 개수
		int n = Integer.parseInt(br.readLine());
		
		// 입력
		// 자료구조의 타입
		int[] A = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		// 초기값 큐인 경우에만 저장한다.
		Deque<Integer> qs = new ArrayDeque<>();
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			int B = Integer.parseInt(st.nextToken());
			if(A[i]==0) {
				qs.addLast(B);
			}
		}
		
		// 삽입할 수열
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<m; i++) {
			qs.addFirst(Integer.parseInt(st.nextToken()));
			sb.append(qs.removeLast()).append(" ");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	/*		시간 초과
	public static void QueueStack() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 자료구조의 개수
		int n = Integer.parseInt(br.readLine());
		
		// 입력
		// 자료구조의 타입
		int[] A = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		// 초기 값.
		int[] B = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}
		
		// 삽입할 수열의 길이
		int M = Integer.parseInt(br.readLine());
		// 삽입할 수열
		int[] C = new int[M];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++) {
			C[i] = Integer.parseInt(st.nextToken());
		}
		
		//큐스택 배열
		Deque<Integer>[] qs = new ArrayDeque[n];
		// 초기화
		for(int i=0; i<n; i++) {
			qs[i] = new ArrayDeque<>();
			qs[i].add(B[i]);
		}
		
		StringBuilder sb = new StringBuilder();
		
		// 수열 삽입
		for(int i=0; i<C.length; i++) {
			int tmp = C[i];
			for(int j=0; j<n; j++) {
				if(A[j] == 0 ) {
					// 큐인 경우
					qs[j].addLast(tmp);
					tmp = qs[j].removeFirst();
				}else {
					// 스택인 경우
					qs[j].addLast(tmp);
					tmp = qs[j].removeLast();
				}
			}
//			bw.write(tmp+" ");  시간초과
			sb.append(tmp).append(" ");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	*/
}
