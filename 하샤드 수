class Solution {
    static int total = 0;
    
    public static void repeat(int x) {
		int quotient = x / 10;
		int remainder = x % 10;
		
		if(quotient == 0) total += remainder;
		else {
			total += remainder;
			repeat(quotient);
		}
		return;
	}
    
    public boolean solution(int x) {
        boolean answer = true;
        
        repeat(x);
		answer = (x%total==0 ? true : false);
        
        return answer;
    }
}
