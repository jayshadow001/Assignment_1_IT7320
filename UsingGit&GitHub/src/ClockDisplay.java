public class ClockDisplay {
	private NumberDisplay hours;
	private NumberDisplay minutes;
	private String displayString ;// this will simulate the actual display
	
	public ClockDisplay(){
		hours = new NumberDisplay(24);
		minutes = new NumberDisplay(60);
		updateDisplay();
	}
	
	public ClockDisplay(int hour, int minute){
		hours = new NumberDisplay(24);
		minutes = new NumberDisplay(60);
		setTime(hour, minute);
	}
	
	public void setTime(int hour, int minute){
		hours.setValue(hour);
		minutes.setValue(minute);
		updateDisplay();
	}
	
	private void updateDisplay(){
		displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue();
	}
}
