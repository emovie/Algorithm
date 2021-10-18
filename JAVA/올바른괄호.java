import java.util.Stack;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
		Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == ')') {
				if(stack.isEmpty()) {
					answer = false;
					break;
				} else {
					stack.pop();
				}
			} else {
				stack.push(ch);
			}
		}
		if(!stack.isEmpty()) answer = false;

        return answer;
    }
}
