package package1;

public class Exercise1 {

	public static void main(String[] args) {
		
		
		
		int highScore = calcultedHighScorePosition(900);
		
		displayHighScorePosition("eli", highScore);
		
		
		highScore = calcultedHighScorePosition(200);
		displayHighScorePosition("player 2", highScore);
	

		highScore = calcultedHighScorePosition(1000);
		displayHighScorePosition("player 3", highScore);
		
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
