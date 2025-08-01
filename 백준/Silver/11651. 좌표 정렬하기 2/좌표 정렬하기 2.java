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
		
		int arr[][] = new int[n][2];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, (arr1, arr2)->{
			if(arr1[1]==arr2[1]) {
				return arr1[0]-arr2[0];
			}else {
				return arr1[1]-arr2[1];
			}
		});
		
		for(int i=0; i<n-1; i++) {
			bw.write(arr[i][0] + " " + arr[i][1]+"\n");
		}
		bw.write(arr[n-1][0] + " " + arr[n-1][1]);
		
		bw.close();
		br.close();
	}

}
