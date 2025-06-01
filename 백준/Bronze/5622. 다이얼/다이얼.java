import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		dialTel();
	}
	
	public static void dialTel() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		
		char chArr[] = new char[str.length()];
		
		
		int cnt = 0;
		
		for(int i=0; i<str.length(); i++) {
			chArr[i] =  str.charAt(i);
			
			switch (chArr[i]) {
			case 'A':
				cnt += 3;
				break;
			case 'B':
				cnt += 3;
				break;
			case 'C':
				cnt += 3;
				break;
				
			case 'D':
				cnt += 4;
				break;
			case 'E':
				cnt += 4;
				break;
			case 'F':
				cnt += 4;
				break;
				
			case 'G':
				cnt += 5;
				break;
			case 'H':
				cnt += 5;
				break;
			case 'I':
				cnt += 5;
				break;
				
			case 'J':
				cnt += 6;
				break;
			case 'K':
				cnt += 6;
				break;
			case 'L':
				cnt += 6;
				break;
				
			case 'M':
				cnt += 7;
				break;
			case 'N':
				cnt += 7;
				break;
			case 'O':
				cnt += 7;
				break;
				
			case 'P':
				cnt += 8;
				break;
			case 'Q':
				cnt += 8;
				break;
			case 'R':
				cnt += 8;
				break;
			case 'S':
				cnt += 8;
				break;
				
			case 'T':
				cnt += 9;
				break;
			case 'U':
				cnt += 9;
				break;
			case 'V':
				cnt += 9;
				break;
				
			case 'W':
				cnt += 10;
				break;
			case 'X':
				cnt += 10;
				break;
			case 'Y':
				cnt += 10;
				break;
			case 'Z':
				cnt += 10;
				break;
			}
		}
		
		bw.write(cnt+"");
		bw.close();
	}
}
