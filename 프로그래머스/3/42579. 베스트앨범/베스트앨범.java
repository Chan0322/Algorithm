import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        
        // 베스트앨범에 수록될 노래의 고유번호 저장 리스트
        List<Integer> bestList = new ArrayList<>();
        
        // 장르별 재생 횟수 (키 : 장르, 값 : 재생 횟수)
        Map<String, Integer> genrePlayCnt = new HashMap<>();
        
        // 장르별 노래 정보
        // (키 : 장르, 값 : Map(키 : 고유 번호, 값 : 재생 횟수))
        Map<String, Map<Integer, Integer>> songs = new HashMap<>();
        
        for(int i=0; i<plays.length; i++){
            String genre = genres[i];
            int play = plays[i];
            
            // 장르별 총 재생 횟수 업데이트
            genrePlayCnt.put(genre, genrePlayCnt.getOrDefault(genre, 0) + play);
            
            // 장르별 노래 정보 업데이트
            if(!songs.containsKey(genre)){
                // 존재하지 않으면 새로 추가
                songs.put(genre, new HashMap<>());
            }
            songs.get(genre).put(i, play);
        }
        
        // 장르별 순위
        List<String> sortGenres = new ArrayList<>(genrePlayCnt.keySet());
        // 재생 횟수별로 장르 내림차순 정렬
        Collections.sort(sortGenres, (a1, a2) ->
                         genrePlayCnt.get(a2) - genrePlayCnt.get(a1));
        
        // 장르 내 정렬
        for(String genre : sortGenres){
            // 노래 정보
            Map<Integer, Integer> song = songs.get(genre);
            // 고유 번호 리스트
            List<Integer> songIdx = new ArrayList<>(song.keySet());
            
            // 노래 목록 정렬
            Collections.sort(songIdx, (i1, i2) -> {
                int p1 = song.get(i1);
                int p2 = song.get(i2);
                
                // 재생횟수별 내림차순
                if(p1 != p2){
                    return p2 - p1;
                }
                
                // 재생횟수 같으면 고유 번호 오름차순
                return i1 - i2;
            });
            
            // 베스트 앨범에 수록
            // 1위
            bestList.add(songIdx.get(0));
            // 2위
            if(songIdx.size()>1){
                bestList.add(songIdx.get(1));
            }
        }
        
        answer = bestList.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}