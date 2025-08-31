import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int N; //체스판 길이
	static int[] col; // col[행] = 열
	static int cnt = 0; // 경우의 수
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		col = new int[N];
		Arrays.fill(col, 0);	// 초기값. 아직 퀸 두지 않음 => 0
		
		back(0);	// 0행부터 퀸 놓기
		
		System.out.println(cnt);
	}
	
	//row 행에 퀸 놓고 유효한 열에 놓을 수 있으면 다음 행으로
	static void back(int row) {
		if(row == N) {	// 0행부터 N-1행까지 퀸 놓았으면 종료
			cnt++;
			return;
		}
		// 현재 행에서 퀸을 놓을 수 있는 모든 열(0~N-1) 검사.
		for(int i=0; i<N; i++) {
			if(isAvailable(row, i)) {	// 놓을 수 있으면 놓고 다음 행으로
				col[row] = i;
				back(row+1);
				col[row] = 0;	// 원상복구
			}
		}
	}
	
	//(row, i)에 퀸 둘 수 있는지 확인.
	// 이미 놓아진 0~row-1 행의 퀸과 부딪히는지 확인.	col[prev] == i이면 같은 열, |row-prev| == |i-col[prev]|이면 같은 대각선에 퀸 존재.
	static boolean isAvailable(int row, int i) {
		for(int prev=0; prev<row; prev++) {
			if(col[prev] == i) return false;
			
			if(Math.abs(row-prev) == Math.abs(i-col[prev])) return false;
		}
		return true;	// 배치 가능
	}

	
}
