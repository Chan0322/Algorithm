import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		pay();
	}

	public static void pay() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 거슬러 줄 동전 개수
		int q, d, n, p;
		
		// 테스트 케이스 개수
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			//초기화
			q=0;
			d=0;
			n=0;
			p=0;
			
			//거스름돈 입력
			int chgMoney = Integer.parseInt(br.readLine());
			
			//거스름 돈 계산
			//쿼터
			q = chgMoney/25;
			// 쿼터 제공 후 남은 나머지 거스름돈
			chgMoney = chgMoney%25;
			
			//다임
			d = chgMoney/10;
			chgMoney = chgMoney%10;
			
			//니켈
			n = chgMoney/5;
			chgMoney %= 5;
			
			// 페니
			p = chgMoney/1;
			chgMoney %= 1;
			
			// 출력
			bw.write(q+" "+d+" "+n+" "+p+"\n");
		}
		bw.close();
	}
}
