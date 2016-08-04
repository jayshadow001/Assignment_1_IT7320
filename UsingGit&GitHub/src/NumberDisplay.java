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
	}
	public static void main(String[] args) {
		System.out.println(".....");
	}
}
