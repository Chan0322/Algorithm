import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		fibo();
	}

	public static void fibo() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int res = fibona(n);
		
		bw.write(res+"");
		bw.close();
		br.close();
	}
	public static int fibona(int n) {
		if(n==0 || n==1) { return n; }
		return fibona(n-1)+fibona(n-2);
	}
}
