import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //closeWindow();
        closeWindow2();
    }

    public static void closeWindow2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 규칙
        // n=5라면 1번쨰:11111 / 2번째:10101 / 3번째:10001 / 4번째:10011 / 5번쨰:10010
        // n=10이라면 최종 값: 1001000010
        // 1, 4, 9...... 제곱번쨰 위치마다 열린 창문 1 증가	=> 완전제곱수 = 열린 창문 갯수
        
        //창문, 사람 수
        int n = Integer.parseInt(br.readLine());
        int res = (int)Math.sqrt(n);	// 완전제곱수
        bw.write(res+"");
        bw.close();
        br.close();
    }

    /* 시간초과
    public static void closeWindow() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //창문, 사람 수
        int n = Integer.parseInt(br.readLine());

        // 창문 닫힘, 열림 확인 위한 변수
        boolean[] window = new boolean[n];

        // 창문 상태에 따라 열고 닫기
        for(int i=1; i<=n; i++){
            for(int j=i; j<=n; j+=i){
                window[j-1] = !window[j-1];
            }
        }

        // 열린창문 갯수
        int cnt = 0;
        for(int i=0; i<window.length; i++){
            if(window[i]){
                cnt++;
            }
        }
        bw.write(cnt+"");
        bw.close();
        br.close();
    }
     */
}
