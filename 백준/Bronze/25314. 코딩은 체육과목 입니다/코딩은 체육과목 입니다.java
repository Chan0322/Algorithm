import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		byteTest();
	}

	public static void byteTest() {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String str = "long ";
		
		for(int i=0; i<(N/4); i++) {
			System.out.print("long ");
		}
		System.out.println("int");
	}
}
