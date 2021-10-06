class Solution {
    public String solution(int[][] scores) {
        String answer = "";
        
        for(int i=0;i<scores.length;i++) {
        	double avg = 0.0;
        	int sum = 0;
        	int self = scores[i][i];
        	int min = 101;
        	int max = -1;
        	String grade = "";
        	
        	for(int j=0;j<scores.length;j++) {
        		if(i!=j) {
        			sum += scores[j][i];
        			min = (scores[j][i] <= min ? scores[j][i] : min);
        			max = (scores[j][i] >= max ? scores[j][i] : max);
        		}
        	}
        	
        	if(self <= max && self >= min) {
        		sum += self;
        		avg = sum / scores.length;
        	} else {
        		avg = sum / (scores.length-1);
        	}
        	
        	grade += (avg >= 90 ? "A" : (avg >= 80 ? "B" : (avg >= 70 ? "C" : (avg >= 50 ? "D" : "F" ))));
        	answer += grade;
        }
        
        return answer;
    }
}
