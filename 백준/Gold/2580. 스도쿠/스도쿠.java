import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static int[][] board = new int[9][9]; // 스도쿠 판
	static List<int[]> blanks = new ArrayList<>(); // 빈 칸 좌표 저장

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력 받기
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				board[i][j] = sc.nextInt();
				if (board[i][j] == 0) {
					blanks.add(new int[] { i, j }); // 빈 칸이면 리스트에 저장
				}
			}
		}

		// 백트래킹 시작
		solve(0);

		// 결과 출력
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	// 백트래킹 함수: 빈 칸을 하나씩 채워나감
	static boolean solve(int depth) {
		if (depth == blanks.size()) {
			return true; // 모든 빈 칸을 채웠으면 성공
		}

		int[] pos = blanks.get(depth);
		int row = pos[0];
		int col = pos[1];

		for (int num = 1; num <= 9; num++) {
			if (isValid(row, col, num)) {
				board[row][col] = num; // 숫자 넣기

				if (solve(depth + 1)) {
					return true; // 다음 칸으로 진행
				}

				board[row][col] = 0; // 실패하면 원상복구 (백트래킹)
			}
		}

		return false; // 가능한 숫자가 없으면 false 반환
	}

	// 현재 위치에 num을 넣을 수 있는지 검사
	static boolean isValid(int row, int col, int num) {
		// 같은 행에 num이 있는지 확인
		for (int i = 0; i < 9; i++) {
			if (board[row][i] == num)
				return false;
		}

		// 같은 열에 num이 있는지 확인
		for (int i = 0; i < 9; i++) {
			if (board[i][col] == num)
				return false;
		}

		// 3x3 박스에 num이 있는지 확인
		int startRow = (row / 3) * 3;
		int startCol = (col / 3) * 3;

		for (int i = startRow; i < startRow + 3; i++) {
			for (int j = startCol; j < startCol + 3; j++) {
				if (board[i][j] == num)
					return false;
			}
		}

		return true; // 중복 없으면 넣을 수 있음
	}

}
