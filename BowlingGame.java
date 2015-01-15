
public class BowlingGame {

	public static void main(String[] args) {
		System.out.println("The Rules of the Game  are as follows-");
		System.out.println("This game has 10 Frames. Each Frame consists of 2 Rolls");
		System.out.println("STRIKE is represented by 'X' and SPARE is represented by '/' ");
		System.out.println("If it is neither STRIKE nor SPARE,then the score of the frame is the total number of pins knocked down in 2 Rolls");
		System.out.println("In case of STRIKE(10 pins knocked in first roll), your Frame ends there.");
		System.out.println("In case of a STRIKE , you get the score for the next two hits also");

		System.out.println("In case of a SPARE(Sum of pins knocked in two rolls is 10),you get the score for the next  hit also");
		System.out.println("In the last Frame ,if you get a STRIKE, you get an extra Roll");
		System.out.println("The Scores get added up cumulatively.That means that the score of current frame equals the score of current Frame plus the score of the Previous Frame ");

		ScoreKeeperUtility scoreKeeperUtility=new  ScoreKeeperUtility();
		scoreKeeperUtility.startGame();


	}

}
