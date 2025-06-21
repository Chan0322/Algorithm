import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		rectangle();
	}

	public static void rectangle() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());	// 세로 길이
		int b = Integer.parseInt(br.readLine());	// 가로 길이
		
		int area = a * b; // 넓이
		
		bw.write(area+"");
		bw.close();
		br.close();
	}
}
