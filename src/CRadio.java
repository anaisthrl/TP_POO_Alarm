public class CRadio {
	//classe représentant l'objet radio
	
	/*............ATTRIBUTS..............*/
	CResultContainer resultContainer;
	
	//constructeur
	CRadio(String chaine){
		System.out.println(chaine);
		resultContainer = new CResultContainer(chaine); //pour l'affichage dans une nouvelle fenetre
	}
}
