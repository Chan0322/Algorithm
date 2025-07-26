import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		snack();
	}

	public static void snack() throws NumberFormatException, IOException {
		// 현재 사람들을 1열로 줄 서있고, 맨 앞사람부터 이동 가능. => 선입선출 => queue
		// 대기열과 간식받는 곳 사이의 빈 공간 먼저 들어간 사람이 먼저 나오지 못함. => 후입선출 => stack

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 학생 수
		int n = Integer.parseInt(br.readLine());

		// 현재 줄.
		Queue<Integer> queue = new LinkedList<>();

		// 현재 순서
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 큐에 저장
		for (int i = 0; i < n; i++) {
			queue.offer(Integer.parseInt(st.nextToken()));
		}

		// 빈 공간
		Stack<Integer> stack = new Stack<>();

		// 현재 받을 순서
		int cnt = 1;

		// 줄서있는 학생이 없을때까지 반복
		while (!queue.isEmpty()) {
			int student = queue.poll(); // 현재 줄의 가장 앞사람

			// 현재 대기열에 간식 받을 순서에 해당하는 사람이 있으면 간식 제공
			if (student == cnt) {
				cnt++;
			} else {
				// 자기 순서가 아니면 빈 공간으로 이동
				stack.push(student);
			}

			while (!stack.isEmpty() && stack.peek() == cnt) {
				// 스택에 현재 순서에 해당하는 사람이 있으면 과자 제공
				stack.pop();
				cnt++; // 다음 순서
			}
		}
		
		// 현재 대기열 큐가 비워졌을 때
		while(!stack.isEmpty()) {
			// 스택에 남은 인원이 있으면
			if(stack.pop() != cnt) {
				// 순서가 맞지 않을 경우 sad
				bw.write("Sad");
				bw.flush();	// return으로 프로그램이 종료 되므로 flush로 버퍼를 비워야 함.
				return;
			}
		}
		
		// 모두 받았으면
		bw.write("Nice");
		bw.close();
		br.close();
	}
}
