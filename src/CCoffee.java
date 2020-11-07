public class CCoffee {

	/*............ATTRIBUTS..............*/

	CResultContainer resultContainer = new CResultContainer("");
	
	//constructeur
	CCoffee(String sound){
		System.out.println(sound);
	    /*windowResult = new CWindowResult();
	    resultContainer = new CResultContainer(sound);
	    windowResult.setResultContainer(this.resultContainer);*/
		this.resultContainer.setMessage(sound);
	}
}
