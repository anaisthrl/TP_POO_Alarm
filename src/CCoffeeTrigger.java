public class CCoffeeTrigger extends CCoffee implements ITrigger<CCoffeeTrigger>{
	
	//classe utilisant l'h�ritage mutiple, elle r�cup�re l'interface ITRigger qui permet de d�clencher une action et CAlarm
		/*..........ATTRIBUTS..........*/
		//son de l'alarme
		private String typeCoffee;
		
		//constructeur
		CCoffeeTrigger(String end, String typeCoffee){
			super(typeCoffee);
			this.typeCoffee = typeCoffee;
		}
		
		/*.........METHODES..........*/
		//lance l'alarme dans la console � l'aide de l'interface
		public CCoffeeTrigger trigger() {
			System.out.println(this.typeCoffee);
	        return this;
		}
		
		//active l'alarme 
		public void activeAlarm()
		{
			this.trigger();
		}
}
