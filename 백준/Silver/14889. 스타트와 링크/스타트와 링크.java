import java.util.Scanner;

public class Main {
	static int N; // 전체 인원 수
	static int[][] S; // 능력치 배열
	static boolean[] visited; // 팀 나누기용 방문 배열
	static int min = Integer.MAX_VALUE; // 최소 차이를 저장할 변수

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); // 인원 수 입력 (짝수)

		S = new int[N][N]; // 능력치 배열 초기화
		visited = new boolean[N]; // 방문 배열 초기화

		// 능력치 입력 받기
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				S[i][j] = sc.nextInt();
			}
		}

		// 백트래킹 시작: N명 중 N/2명을 선택하는 조합 생성
		dfs(0, 0);

		// 결과 출력: 최소 능력치 차이
		System.out.println(min);
	}

	/**
	 * dfs 함수: N명 중 N/2명을 선택하는 모든 조합을 탐색
	 * 
	 * @param depth 현재까지 선택한 인원 수
	 * @param start 다음 탐색을 시작할 인덱스
	 */
	static void dfs(int depth, int start) {
		// N/2명을 선택했으면 두 팀으로 나눠서 능력치 계산
		if (depth == N / 2) {
			calculate(); // 능력치 차이 계산
			return;
		}

		// 조합 생성: 중복 없이 N/2명을 선택
		for (int i = start; i < N; i++) {
			if (!visited[i]) {
				visited[i] = true; // i번 사람을 스타트 팀으로 선택
				dfs(depth + 1, i + 1); // 다음 사람 선택
				visited[i] = false; // 백트래킹: 선택 취소
			}
		}
	}

	/**
	 * calculate 함수: 현재 visited 배열을 기준으로 두 팀의 능력치 차이를 계산
	 */
	static void calculate() {
		int startSum = 0; // 스타트 팀 능력치 합
		int linkSum = 0; // 링크 팀 능력치 합

		// 모든 쌍(i, j)에 대해 같은 팀이면 능력치 합산
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (visited[i] && visited[j]) {
					// 둘 다 스타트 팀이면 능력치 합산
					startSum += S[i][j];
				} else if (!visited[i] && !visited[j]) {
					// 둘 다 링크 팀이면 능력치 합산
					linkSum += S[i][j];
				}
			}
		}

		// 두 팀의 능력치 차이 계산
		int diff = Math.abs(startSum - linkSum);

		// 최소값 갱신
		min = Math.min(min, diff);
	}

}
