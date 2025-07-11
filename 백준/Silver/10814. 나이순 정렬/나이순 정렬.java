import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//age(); // 시간초과
		age2();
	}

	public static void age2() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());

		// 회원 나이와 이름 저장
		String[][] person = new String[n][2];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			person[i][0] = st.nextToken(); // 나이
			person[i][1] = st.nextToken(); // 이름
		}
		
		Arrays.sort(person, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
			}
		});
		
		for (int i = 0; i < n; i++) {
			bw.write(person[i][0] + " " + person[i][1] + "\n");
		}
		bw.close();
		br.close();
	}
	
	/* 시간 초과`
	public static void age() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());

		// 회원 나이와 이름 저장
		String[][] person = new String[n][2];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			person[i][0] = st.nextToken(); // 나이
			person[i][1] = st.nextToken(); // 이름
		}

		// 정렬 (버블) => 가장 큰 값이 끝으로. => 뒤에서부터 정렬이 됨!
		for (int i = 0; i < n - 1; i++) {
		    for (int j = 0; j < n - 1 - i; j++) {
		        int age1 = Integer.parseInt(person[j][0]);
		        int age2 = Integer.parseInt(person[j + 1][0]);

		        // 나이가 더 많으면 교환 (같은 나이는 교환 안 함 => 입력 순서 유지)
		        if (age1 > age2) {
		            String ageTmp = person[j][0];
		            String nameTmp = person[j][1];

		            person[j][0] = person[j + 1][0];
		            person[j][1] = person[j + 1][1];
		            person[j + 1][0] = ageTmp;
		            person[j + 1][1] = nameTmp;
		        }
		    }
		}
		for (int i = 0; i < n; i++) {
			bw.write(person[i][0] + " " + person[i][1] + "\n");
		}
		bw.close();
		br.close();
	}
	*/
}
