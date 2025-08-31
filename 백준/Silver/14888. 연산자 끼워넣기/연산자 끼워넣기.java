import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N; // 숫자 개수
	static int[] nums; // 숫자 저장할 배열
	static int[] oper; // 연산자 개수 확인 위한 배열

	static int max = Integer.MIN_VALUE;	// 최대값 저장하기 위함.
	static int min = Integer.MAX_VALUE;	// 최소값 저장하기 위함.
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 입력
		N = Integer.parseInt(br.readLine());
		nums = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		oper = new int[4];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<4; i++	) {
			oper[i] = Integer.parseInt(st.nextToken());
		}
		
		back(1, nums[0]);
		
		System.out.println(max);
		System.out.println(min);
	}
	
	// idx : 다음에 사용할 숫자 인덱스 번호  /  res : 왼쪽에서 오른쪽 순서로 계산한 누적 값.
	static void back(int idx, int res) {
		if(idx == N) {
			// 모든 숫자를 다 썼을 때 최대값 최소값 저장.
			if(res > max) max = res;
			if(res < min) min = res;
			return;
		}
		
		// 4가지의 연산자로 계산 시도
		for(int i=0; i<4; i++) {
			if(oper[i]==0) continue;	// 연산자의 사용 가능 개수 없으면 다음 연산자
			
			oper[i]--; // 사용한 연산자는 차감
			
			// 현재 결과에 다음 숫자를 적용해 연산
			int next = apply(res, nums[idx], i);
			
			back(idx+1, next);	// 다음 숫자로 백트래킹
			
			oper[i]++; // 연산자 개수 원래대로.
		}
	}
	
	// n1 : 현재 누적 결과, n2 : 다음 숫자, n3 : 연산자 인덱스
	static int apply(int n1, int n2, int op) {
		switch (op) {
		case 0:
			return n1+n2;
		case 1:
			return n1-n2;
		case 2:
			return n1*n2;
		case 3:
			if(n2==0) {
				return 0;
			}
			if(n1<0) {
				// n1이 음수이면 절댓값으로 나누고 음수
				return -(Math.abs(n1)/n2);
			}else {
				return n1/n2;
			}
		default:
			return 0;
		}
	}

}
