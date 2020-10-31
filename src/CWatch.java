public class CWatch extends CCounterChain {
	
	//attributs
	private boolean isRool = true;

		
	//constructeur
		
	CWatch() {
		super(3, new int[] {0, 0, 0}, new int[] {24, 60, 60}, new int[] {1, 1, 1});
	}
		
	//méthodes
		
	public void rool() {
		while(isRool) {
			display();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			increment();
		}
	}
		
	//regler l heure
	public void setTheTime(int h, int m, int s) {
		for (int i = 0; i < h * 3600 + m * 60 + s; i++) {
			increment();
		}
	}

	//arreter la montre
	public void stopWatch(){
		this.isRool = false;
	}	
	
}
