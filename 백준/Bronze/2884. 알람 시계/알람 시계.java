import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		alarmTest();
	}

	
	public static void alarmTest() {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(H>=0&&H<=23 && M>=0&&M<=59) {
			if(H==0 && M<45) {
				H = 23;
				M = 60-(45-M);
			}else if(M<45) {
				H -= 1;
				M = 60-(45-M);
			}else {
				M -= 45;
			}
			System.out.println(H + " " + M);
		}else {
			System.out.println("올바른 시간을 입력해 주세요.");
		}
	}
}
