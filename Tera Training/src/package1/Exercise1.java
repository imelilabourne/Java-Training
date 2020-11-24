package package1;

public class Exercise1 {

	public static void main(String[] args) {
		
		
		
		int highScore = calcultedHighScorePosition(900);
		
		displayHighScorePosition("eli", highScore);
		
	
	}
	
	public static void displayHighScorePosition(String name, int position){
		System.out.println(name + " managed to get into position " + position
				+ " on the high score table");
	}

	
	public static int calcultedHighScorePosition(int score) {
		if(score > 1000) {
			return 1;
		}
		else if(score > 500 && score < 1000) {
			return 2;
		}
		else if(score > 100 && score < 500) {
			return 3;
		}
		
		else {
			return 4;
		}
	}

}
