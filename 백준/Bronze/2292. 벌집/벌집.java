import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		beeHouse();
	}

	public static void beeHouse() {
		// 6씩 늘어날 때마다 방 갯수 1 증가.
		Scanner sc = new Scanner(System.in);

		// 6 간격으로 방 범위 지정 위함.
		int n = 2;
		
		// 방 번호 입력
		int inputN = sc.nextInt();

		// 방 갯수 카운트. 1번방부터 시작이므로 기본 값 1
		int cnt = 1;
		
		if(inputN==1) {
			System.out.println(1);
		}else {
			while(n <= inputN) {
				n += (6*cnt);
				cnt++;
			}
			System.out.println(cnt);
		}
	}
}
