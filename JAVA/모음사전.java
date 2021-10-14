class Solution {
    public int solution(String word) {
        int answer = 0;
        int[] arr = {781, 156, 31, 6, 1};
        String str = "AEIOU";
        
        for(int i = 0;i < word.length();i++) {
			answer += str.indexOf(word.charAt(i)) * arr[i] + 1;
		}
        
        return answer;
    }
}
