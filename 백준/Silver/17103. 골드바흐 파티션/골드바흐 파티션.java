import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
//        Goldbach();		시간초과
    	Goldbach2();
    }
    
    public static void Goldbach2() throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int MAX = 1000000;
        
        // 테스트 케이스 갯수 입력
        int t = Integer.parseInt(br.readLine());
        //테스트 케이스 입력
        int cases[] = new int[t];
        for(int i=0; i<t; i++) {
        	cases[i] = Integer.parseInt(br.readLine());
        }
        
        // 1000000까지의 소수 판별을 위한 배열
        boolean[] isPrime = new boolean[MAX+1];
        Arrays.fill(isPrime, true);	// 배열 초기화
        // 0과 1은 소수 아님.
        isPrime[0] = false;
        isPrime[1] = false;
        
        // 에라토스테네스의 체 이용해 소수 구함
        // 에라토스테네스의 체 : 2~n까지의 모든 자연수 나열
        //	=> 가장 작은 소수인 2부터 자기자신을 제외한 그 수의 배수들을 제거. 
        //	=> 남아있는 수가 소수!
        for(int i=2; i*i<=MAX; i++) {
        	if(isPrime[i]) {
        		for(int j=i*i; j<=MAX; j+=i) {
        			isPrime[j] = false;
        		}
        	}
        }
        
        // 골드바흐 개수 구하기
        for(int n : cases) {
        	int cnt = 0;
        	
        	// 두 소수 합이 n이면 cnt++
        	for(int i=2; i<=n/2; i++) {
        		if(isPrime[i] && isPrime[n-i]) {
        			cnt++;
        		}
        	}
        	bw.write(cnt+"\n");
        }
        bw.close();
        br.close();
    }
    
    /*
    public static void Goldbach() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 규칙
        // 예: n=10;
        // 0, 1, 2, 3, 4 ,5 ,6 ,7 ,8 ,9, 10 => n = i+(n-i)

        // 테스트 케이스 갯수 입력
        int t = Integer.parseInt(br.readLine());

        // t만큼 반복
        for(int i=0; i<t; i++) {
            int n = Integer.parseInt(br.readLine());
            // 골드비흐 갯수
            int cnt = 0;
            for (int j = 2; j <= n / 2; j++) {
                // 둘 다 소수이면 ++
                if (isPrime(j) && isPrime(n - j)) {
                    cnt++;
                }
            }
            bw.write(cnt+"\n");
        }
        bw.close();
        br.close();
    }
    public static boolean isPrime(int n){
        if(n<2){return false;}
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0) {return false;}
        }
        return true;
    }
    */
}
