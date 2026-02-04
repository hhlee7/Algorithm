class Solution {
    public int solution(String myString, String pat) {
        String A = myString.replace("A", "X")
                            .replace("B", "A")
                            .replace("X", "B");
        
        if(A.contains(pat)) {
            return 1;
        }
        return 0;
    }
}