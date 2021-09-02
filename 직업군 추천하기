import java.util.Arrays;
import java.util.List;

class Solution {
    public String solution(String[] table, String[] languages, int[] preference) {
        String answer = "";
        int total = -1;
        
        for(String filed : table) {
	    List<String> rankList = Arrays.asList(filed.split(" "));
	    String title = rankList.get(0);
            int sum = 0;
			
	    for(int i=0;i<languages.length;i++) {
	        String lang = languages[i];
		int pref = preference[i];
				
		if(filed.contains(lang)) {
                    int index = rankList.indexOf(lang);
                    if(index > 0) {sum += ((6-index)*pref);}
		}
	    }
			
	    if(total == sum) {
		answer = (answer.compareToIgnoreCase(title) > 0 ? title : answer);
		total = (answer.compareToIgnoreCase(title) > 0 ? total : sum);
	    } else if(total<sum) {
		answer = title;
		total = sum;
            }	
	}
        
        return answer;
    }
}
