import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		IAmAPokemonMasterDaSomLee();
	}

	public static void IAmAPokemonMasterDaSomLee() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());	// 포켓몬 n마리 입력
		int m = Integer.parseInt(st.nextToken());	//찾고싶은 포켓몬 수
		
		Map<String, String> numDic = new HashMap<>();   // 포켓몬 도감 저장할 맵. key : 번호, value : 이름
		Map<String, String> nameDic = new HashMap<>();   // 포켓몬 도감 저장할 맵. key : 이름, value : 번호
		
		// 포켓몬 도감 입력
		for(int i=0; i<n; i++) {
			String name = br.readLine();
			numDic.put((i+1)+"", name);
			nameDic.put(name, (i+1)+"");
		}
		
		// 찾고싶은 포켓몬 입력
		String[] findPokemon = new String[m];
		for(int i=0; i<m; i++) {
			findPokemon[i] = br.readLine();
		}
		
		// 도감 조회
		for(int i=0; i<findPokemon.length; i++) {
			if(Character.isDigit(findPokemon[i].charAt(0))) {
				// 번호가 입력되면 결과를 배열에 다시 저장
				findPokemon[i] = numDic.get(findPokemon[i]);
			}else {
				// 이름이 입력되면 결과를 배열에 다시 저장
				findPokemon[i] = nameDic.get(findPokemon[i]);
			}
		}
		
		// 출력
		for(int i=0; i<findPokemon.length; i++) {
			bw.write(findPokemon[i]+"\n");
		}
		
		bw.close();
		br.close();
	}
}
