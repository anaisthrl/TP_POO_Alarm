public class CCounterChain {
	
	//attributs
	
	private CCounter[] tabCounter; //tableau de compteurs

	//constructeur
		
	public CCounterChain(int nbCounter, int[] min, int[] max, int[] step) {
		this.tabCounter = new CCounter[nbCounter];
		for (int i = 0; i < nbCounter; i++) {
			this.tabCounter[i] = new CCounter(min[i], max[i], step[i]);
		}
	}
		
	//méthodes
		
	//incrémentation de ma chaine de compteur
	public void increment() {
		boolean finish = false;
		for (int i = tabCounter.length - 1; i >= 0 && !finish; i--) { //increment à partir de la fin
			finish = !tabCounter[i].increment();
		}
	}
		
	//remise à zéro de mes compteurs
	public void resetToZero() {
		for (CCounter counter : tabCounter) {
			counter.resetToZero();
		}
	}
		
	//affichage
		
	public void display() {
		System.out.println(toString());
	}

	public String toString() {
		String val ="";
		for (int i = 0; i < tabCounter.length; i++) {
			val += tabCounter[i].toString();
			if (i != tabCounter.length - 1) {
				val += ':';
			}
		}
		return val;
	}
	
}
