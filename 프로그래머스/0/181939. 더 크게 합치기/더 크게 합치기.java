class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a);
        
        int x = Integer.parseInt(ab);
        int y = Integer.parseInt(ba);
        
        if(x > y) {
            answer = x;
        } else {
            answer = y;
        }
        
        return answer;
    }
}