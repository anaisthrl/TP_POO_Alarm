public class CRadio {

	//classe repr�sentant l'objet radio
	/*............ATTRIBUTS..............*/

	CResultContainer resultContainer = new CResultContainer("");
	
	//constructeur
	CRadio(String chaine){
		System.out.println(chaine);
	    /*windowResult = new CWindowResult();
	    resultContainer = new CResultContainer(chaine);
	    windowResult.setResultContainer(this.resultContainer);*/
		this.resultContainer.setMessage(chaine);
	}
}
