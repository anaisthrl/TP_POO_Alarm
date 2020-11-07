public class CCoffee {

	/*............ATTRIBUTS..............*/
	CResultContainer resultContainer;
	
	//constructeur
	CCoffee(String sound){
	System.out.println(sound);
    resultContainer = new CResultContainer(sound);
	}
}
