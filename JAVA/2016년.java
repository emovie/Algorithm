package coding;

public class Year2016 {

	public static void main(String[] args) {
		int a = 5;
		int b = 26;
		String answer = "";
		
		int day = 0;
		
		for(int i=1;i<a;i++) {
			switch (i) {
			case 2:
				day += 29;
				break;
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				day += 31;
				break;
			case 4: case 6: case 9: case 11:
				day += 30;
				break;
			}
		}
		day += b;
		
		switch (day%7) {
		case 0: answer="THU"; break;
		case 1: answer="FRI"; break;
		case 2: answer="SAT"; break;
		case 3: answer="SUN"; break;
		case 4: answer="MON"; break;
		case 5: answer="TUE"; break;
		case 6: answer="WED"; break;
		}
		
		System.out.println(answer);
	}

}
