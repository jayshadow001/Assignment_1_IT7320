public class ClockDisplay {
	private NumberDisplay hours;
	private NumberDisplay minutes;
	private String displayString ;// this will simulate the actual display
	
	public ClockDisplay(){
		hours = new NumberDisplay(24);
		minutes = new NumberDisplay(60);
		updateDisplay();
	}
	
	private void updateDisplay(){
		displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue();
	}
}
