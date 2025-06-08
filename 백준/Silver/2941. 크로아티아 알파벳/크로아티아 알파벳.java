import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		croatia();
	}
	
	public static void croatia() throws IOException {
		String arr[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		
		// 입력된 문자열이 크로아티아 알파벳을 포함하면,
		// 해당 부분을 하나의 문자로 변경
		for(int i=0; i<arr.length; i++) {
			if(str.contains(arr[i])) {
				str = str.replace(arr[i], "a");
			}
		}
		
		bw.write(str.length()+"");
		bw.close();
	}
}
