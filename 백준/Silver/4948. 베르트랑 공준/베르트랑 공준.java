import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BertrandPostulate();
    }

    public static void BertrandPostulate() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 0이 입력될 때까지 무한반복
        while(true){
            int n = Integer.parseInt(br.readLine());

            // 0입력 시 종료
            if(n==0){
                break;
            }

            // 소수 갯수 변수
            int cnt = 0;

            // n보다 크고 2n보다 작거나 같은 소수
            for(int i=n+1; i<=2*n; i++){
                if(isPrime(i)){
                    cnt++;
                }
            }
            bw.write(cnt+"\n");
        }
        bw.close();
        br.close();
    }

    // 소수 판별
    public static boolean isPrime(int n){
        if(n<2) {return false;}
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
