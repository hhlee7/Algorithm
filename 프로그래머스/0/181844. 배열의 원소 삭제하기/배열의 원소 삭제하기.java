import java.util.HashSet;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        HashSet<Integer> deleteSet = new HashSet<>();
        
        for(int x : delete_list) {
            deleteSet.add(x);
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int x : arr) {
            if(!deleteSet.contains(x)) {
                result.add(x);
            }
        }
        
        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}