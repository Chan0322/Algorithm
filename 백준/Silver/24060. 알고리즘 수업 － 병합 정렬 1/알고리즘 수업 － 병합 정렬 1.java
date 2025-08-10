
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		mergeSort();
	}

	static int[] A, tmp;
	static int K, count=0, result=0;
	
	public static void mergeSort() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 배열 크기
		int n = Integer.parseInt(st.nextToken());
		// 저장 횟수
		K = Integer.parseInt(st.nextToken());
		
		// 배열 A
		A = new int[n];
		tmp = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		merge_sort(0, n-1);
		
		bw.write((count<K?-1:result)+"");
		
		bw.close();
		br.close();
	}
	
	public static void merge_sort(int p, int r) {
		if(p<r) {
			int q = (p+r)/2;
			merge_sort(p, q);
			merge_sort(q+1, r);
			merge(p, q, r);
		}
	}
	
	public static void merge(int p, int q, int r) {
		int i=p, j=q+1, t=0;
		
		while(i <= q && j <= r) {
			if(A[i]<=A[j]) {tmp[t++] = A[i++];}
			else {tmp[t++] = A[j++];}
		}
		
		while(i<=q) {tmp[t++] = A[i++];}
		while(j<=r) {tmp[t++] = A[j++];}
		
		i = p;
		t = 0;
		while(i<=r) {
			A[i] = tmp[t++];
			count++;
			if(count == K) {result = A[i];}
			i++;
		}
	}
}
