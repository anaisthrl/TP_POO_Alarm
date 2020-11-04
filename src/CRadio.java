public class CRadio {

	//classe représentant l'objet radio
	/*............ATTRIBUTS..............*/
	CWindowResult windowResult;
	CResultContainer resultContainer;
	
	//constructeur
	CRadio(String chaine){
		System.out.println(chaine);
	    windowResult = new CWindowResult();
	    resultContainer = new CResultContainer(chaine);
	    windowResult.setResultContainer(this.resultContainer);
	}
}
