import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		diceTest();
	}

	public static void diceTest() {
		Scanner sc = new Scanner(System.in);
		
		int one = sc.nextInt();
		int two = sc.nextInt();
		int three = sc.nextInt();
		
		int sum = 0;
		
		if(one==two && one==three) {
			sum = 10000 + (one*1000);
		}else if(one==two || one==three) {
			sum = 1000 + (one*100);
		}else if(two==three) {
			sum = 1000 + (two*100);
		}else {
			if(one>two && one>three) {
				sum = one*100;
			}else if(two>one && two>three) {
				sum = two*100;
			}else if(three>one && three>two) {
				sum = three*100;
			}
		}
		System.out.println(sum);
	}
}
