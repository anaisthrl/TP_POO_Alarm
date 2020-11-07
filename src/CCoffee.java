public class CCoffee {

	/*............ATTRIBUTS..............*/
	CWindowResult windowResult;
	CResultContainer resultContainer;
	
	//constructeur
	CCoffee(String sound){
	System.out.println(sound);
    windowResult = new CWindowResult();
    resultContainer = new CResultContainer(sound);
    windowResult.setResultContainer(this.resultContainer);
	}
}
