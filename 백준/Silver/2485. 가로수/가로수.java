import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		trees();
	}
	
	public static void trees() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//규칙 : 기존 존재하는 가로수의 간격의 최대공약수를 구하기.
		// => 각 간격마다 최대공약수로 나누고 -1 => 심어야 할 나무의 갯수.
		
		// 존재하는 가로수 수
		int n = Integer.parseInt(br.readLine());
		
		// 가로수 입혁
		int trees[] = new int[n];
		for(int i=0; i<n; i++) {
			trees[i] = Integer.parseInt(br.readLine());
		}
		
		// 간격 구하기
		int range[] = new int[n-1];
		for(int i=1; i<n; i++) {
			range[i-1] = trees[i] - trees[i-1];
		}
		
		// 간격의 최대 공약수 계산.
		int tmp = range[0];
		for(int i=1; i<range.length; i++) {
			 int a = tmp;
			    int b = range[i];	
			    while (b != 0) {
			        int r = a % b;
			        a = b;
			        b = r;
			    }
			    tmp = a;
		}
		
		// 심어야 할 가로수 갯수
		int res = 0;
		for(int i=0; i<range.length; i++) {
			res += (range[i]/tmp)-1;
		}
		
		bw.write(res+"");
		bw.close();
		br.close();
	}
}
