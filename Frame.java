
public class Frame {

	//Declaring Class Variables
	private int roll_1_pins_knocked_down=0;  //Roll 1 for the frame- number of pins knocked down
	private int roll_2_pins_knocked_down=0;  //Roll 2 for the frame- number of pins knocked down
	private int roll_3_pins_knocked_down=0;  //Roll 3 for the frame- number of pins knocked down
	private int absolute_score_of_frame=0;  //This contains the total number of pins knocked in the frame
	private int total_score_of_this_frame=0;//This contains the total score of  frame
	private int cumulative_score=0;

	private boolean frame_Strike=false;  //Is the Frame a Strike or not
	private boolean frame_Spare=false;//Is the Frame a Spare or not 

	private boolean strike_in_last_frame= false;//Is there a Strike in the last frame

	private boolean is_first_updated=false;
	private boolean is_second_updated=false;




	public int getCumulative_score() {
		return cumulative_score;
	}
	public void setCumulative_score(int cumulative_score) {
		this.cumulative_score = cumulative_score;
	}
	public boolean isIs_first_updated() {
		return is_first_updated;
	}
	public void setIs_first_updated(boolean is_first_updated) {
		this.is_first_updated = is_first_updated;
	}
	public boolean isIs_second_updated() {
		return is_second_updated;
	}
	public void setIs_second_updated(boolean is_second_updated) {
		this.is_second_updated = is_second_updated;
	}
	public int getRoll_1_pins_knocked_down() {
		return roll_1_pins_knocked_down;
	}
	public void setRoll_1_pins_knocked_down(int roll_1_pins_knocked_down) {
		this.roll_1_pins_knocked_down = roll_1_pins_knocked_down;
	}
	public int getRoll_2_pins_knocked_down() {
		return roll_2_pins_knocked_down;
	}
	public void setRoll_2_pins_knocked_down(int roll_2_pins_knocked_down) {
		this.roll_2_pins_knocked_down = roll_2_pins_knocked_down;
	}
	public int getRoll_3_pins_knocked_down() {
		return roll_3_pins_knocked_down;
	}
	public void setRoll_3_pins_knocked_down(int roll_3_pins_knocked_down) {
		this.roll_3_pins_knocked_down = roll_3_pins_knocked_down;
	}
	public int getAbsolute_score_of_frame() {
		return absolute_score_of_frame;
	}
	public void setAbsolute_score_of_frame(int absolute_score_of_frame) {
		this.absolute_score_of_frame = absolute_score_of_frame;
	}
	public int getTotal_score_of_this_frame() {
		return total_score_of_this_frame;
	}
	public void setTotal_score_of_this_frame(int total_score_of_this_frame) {
		this.total_score_of_this_frame = total_score_of_this_frame;
	}
	public boolean isFrame_Strike() {
		return frame_Strike;
	}
	public void setFrame_Strike(boolean frame_Strike) {
		this.frame_Strike = frame_Strike;
	}
	public boolean isFrame_Spare() {
		return frame_Spare;
	}
	public void setFrame_Spare(boolean frame_Spare) {
		this.frame_Spare = frame_Spare;
	}

	public boolean isStrike_in_last_frame() {
		return strike_in_last_frame;
	}
	public void setStrike_in_last_frame(boolean strike_in_last_frame) {
		this.strike_in_last_frame = strike_in_last_frame;
	}


	//Getters and Setters




}
