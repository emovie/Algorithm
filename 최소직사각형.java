class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int width = 0;
		int height = 0;
        
        for(int i = 0;i < sizes.length; i++) {
			int max = (sizes[i][0] >= sizes[i][1] ? sizes[i][0] : sizes[i][1]);
			int min = (sizes[i][1] >= sizes[i][0] ? sizes[i][0] : sizes[i][1]);
			
			width = (max > width ? max : width);
			if(min >= width) 	  height = min;
			else if(min > height) height = min;
		}
        
        answer = width * height;
        
        return answer;
    }
}
