public class NumberDisplay{

	private int limit;
	private int value;
	
	public NumberDisplay(int rollOverLimit){
		limit = rollOverLimit;
		value = 0;
	}
	public int getValue(){
		return value;
	}
	public void setValue(int replacementValue){
		if((replacementValue >=0 ) && (replacementValue < limit)){
			value = replacementValue;
		}
		else{
			System.out.println("error");
		}
	}
	public String getDisplayValue() {
		if(value <10){
			return "0" + value;
		}
		else{
			return "" + value;
		}
	}
	public void increment(){
		value =(value + 1) % limit;
	}
	public static void main(String[] args) {
		System.out.println("This is a clock display");
		//add another Sysout here Bruce
	}
	
}
