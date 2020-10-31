public class CCounter {
	
	//attributs
	
	private int min;
	private int max;
	private int step;
	private int value;
		
	//constructeur

	public CCounter(int min, int max, int pas) {
		this.min = min;
		this.max = max;
		this.step = pas;
		this.value = min;
	}
		
	//méthodes
		
	public int getMin() {
		return this.min;
	}
		
	public int getMax() {
		return this.max;
	}
		
	public int getStep() {
		return this.step;
	}
		
	public int getValue() {
		return this.value;
	}
		
	// incrementation de mon compteur
	public boolean increment() {
		this.value += step;
		if (value >= max) {
			value = min;
			return true;
		}
		return false;
	}
		
	//remise a zero 
	public void resetToZero() {
		this.value = min;
	}
		
	//affichage
	public String toString() {
		return String.valueOf(value);
	}
}
