import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		grade();
	}
	
	public static void grade() throws IOException {
		//전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 과목명, 학점, 등급 저장할 배열
		String[] subject = new String[20];
		double[] point = new double[20];
		String[] grade = new String[20];
		
		// 과목별 학점x과목평점
		double sumPG = 0;
		// 학점 총합
		double sumP = 0;
		
		//20줄 입력
		for(int i=0; i<20; i++) {
			// 과목 학점 등급 입력
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			// 각 배열에 과목, 학점, 등급 저장
			subject[i] = st.nextToken();
			point[i] = Double.parseDouble(st.nextToken());
			grade[i] = st.nextToken();
		}
			
		// 학점 총합
		for(int i=0; i<point.length; i++) {
			if(grade[i].equals("P")) {  // 문자열은 ==가 아닌 equals 사용해야 함!!!
				point[i] = 0;
			}else {
				sumP += point[i];
			}
		}
			
		// 학점x과목평점 총합
		for(int i=0; i<20; i++) {
			// 각 등급 별 평점 곱하기.
			switch(grade[i]) {
			case "A+":
				sumPG += (point[i]*4.5);
				break;
			case "A0":
				sumPG += (point[i]*4.0);
				break;
			case "B+":
				sumPG += (point[i]*3.5);
				break;
			case "B0":
				sumPG += (point[i]*3.0);
				break;
			case "C+":
				sumPG += (point[i]*2.5);
				break;
			case "C0":
				sumPG += (point[i]*2.0);
				break;
			case "D+":
				sumPG += (point[i]*1.5);
				break;
			case "D0":
				sumPG += (point[i]*1.0);
				break;
			case "F":
				sumPG += (point[i]*0);
				break;
			default:
				continue;
			}
		}
		//결과 출력
		double res = sumPG/sumP;
		bw.write(res+"");
		bw.close();
	}
}
