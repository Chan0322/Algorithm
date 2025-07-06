import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		// x,y 저장할 2차원 배열
		int Arr[][] = new int[n][2];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			Arr[i][0] = Integer.parseInt(st.nextToken());
			Arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		// 2차원 배열은 일반 Arrays.sort 불가. 람다식 사용 필요.
		
		Arrays.sort(Arr, (arr1, arr2)->{
			if(arr1[0] == arr2[0]) {
				return arr1[1] - arr2[1];
			}else {
				return arr1[0] - arr2[0];
			}
		});
		
		// 시간 초과
//		for(int i=0; i<n-1; i++) {
//			for(int j=i+1; j<n; j++) {
//				if(Arr[i][0]>Arr[j][0]) {
//					//x 좌표 우선 정렬
//					int xTmp = Arr[i][0];
//					int yTmp = Arr[i][1];
//					
//					Arr[i][0] = Arr[j][0];
//					Arr[i][1] = Arr[j][1];
//					Arr[j][0] = xTmp;
//					Arr[j][1] = yTmp;
//				}
//				
//				if(Arr[i][0]==Arr[j][0] && Arr[i][1]>Arr[j][1]) {
//					// y좌표 정렬
//					int xTmp = Arr[i][0];
//					int yTmp = Arr[i][1];
//					
//					Arr[i][0] = Arr[j][0];
//					Arr[i][1] = Arr[j][1];
//					Arr[j][0] = xTmp;
//					Arr[j][1] = yTmp;
//				}
//			}
//		}
		
		
		
		// 출력
		for(int i=0; i<n-1; i++) {
			bw.write(Arr[i][0]+" "+Arr[i][1]+"\n");
		}
		bw.write(Arr[n-1][0]+" "+Arr[n-1][1]);
		
		bw.close();
		br.close();
	}

}
