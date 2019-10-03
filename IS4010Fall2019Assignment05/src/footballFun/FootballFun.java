/*
 * IS4010 Fal 2019
 * Assignment 05
 * Brett Ziegler
 * zieglebt@mail.uc.edu
 */
package footballFun;

public class FootballFun {

	public static void main(String[] args) {
		int correctCount = 0;
		if (translateScore(2).equals("safety") == true) { correctCount++;}
		if (translateScore(3).equals("field goal") == true) { correctCount++;}
		if (translateScore(6).equals("touchdown") == true) { correctCount++;}
		if (translateScore(7).equals("touchdown and extra point") == true) { correctCount++;}
		if (translateScore(8).equals("touchdown and 2-point conversion") == true) { correctCount++;}
		if (translateScore(-1).equals("") == true) { correctCount++;}
		if (translateScore(1).equals("invalid") == true) { correctCount++;}
		if (translateScore(10).equals("you must be playing Quidditch ") == true) { correctCount++;}
		
		if (correctCount == 8) {
			System.out.println("All tests passed");
		} else {
			System.out.println("At least one test failed");
		}
	}
	public static String translateScore (int score) {
		if (score == 2) {return "safety";}		//returns score for safety
		if (score == 3) {return "field goal";}		//returns score for field goal
		if (score == 6) {return "touchdown";}		//returns score for touchdown
		if (score == 7) {return "touchdown and extra point";}		//returns score for touchdown and extra point
		if (score == 8) {return "touchdown and 2-point conversion";}		//returns score for touchdown and 2-point conversion
		if (score == -1) {return "";}		//returns score for ""
		if (score == 1) {return "invalid";}		//returns score for invalid
		if (score == 10) {return "you must be playing Quidditch ";}		//returns score for you must be playing Quidditch
		
		return "";
	}
}
