import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		rememberTriangle();
	}

	public static void rememberTriangle() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int angle1 = Integer.parseInt(br.readLine());
		int angle2 = Integer.parseInt(br.readLine());
		int angle3 = Integer.parseInt(br.readLine());
		
		int sum = angle1 + angle2 + angle3; 	// 세 각의 합
		
		if(angle1==60 && angle2==60 && angle3==60) {
			// 세 각 모두 60이면
			bw.write("Equilateral");
		}else if(sum==180 && (angle1==angle2 || angle1==angle3 || angle2==angle3)) {
			// 세 각 합 180, 두 각 같음.
			bw.write("Isosceles");
		}else if(sum==180 && (angle1!=angle2 && angle1!=angle3 && angle2!=angle3)) {
			// 세 각 합 180, 같은 각 없음.
			bw.write("Scalene");
		}else if(sum != 180) {
			bw.write("Error");
		}
		
		bw.close();
		br.close();
	}
}
