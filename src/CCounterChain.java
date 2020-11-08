public class CCounterChain {
	
	/*.....attributs.....*/
	
	private CCounter[] tabCounter; //tableau de compteurs
	//CResultContainer resultContainer;

	//constructeur
		
	public CCounterChain(int nbCounter, int[] min, int[] max, int[] step) {
		this.tabCounter = new CCounter[nbCounter];
		//resultContainer = new CResultContainer("0:0:0");
		for (int i = 0; i < nbCounter; i++) {
			this.tabCounter[i] = new CCounter(min[i], max[i], step[i]);
		}
	}
		
	/*.....M�thodes.....*/
		
	//incr�mentation de ma chaine de compteur
	public void increment() {
		boolean finish = false;
		for (int i = tabCounter.length - 1; i >= 0 && !finish; i--) { //increment � partir de la fin
			finish = !tabCounter[i].increment();
		}
	}
		
	//remise � z�ro de mes compteurs
	public void resetToZero() {
		for (CCounter counter : tabCounter) {
			counter.resetToZero();
		}
	}
		
	//affichage
		
	public void display() {
		System.out.println(this.toString());
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
