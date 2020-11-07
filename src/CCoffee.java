public class CCoffee {
	//Classe représentant l'objet Machine à Café
	
	/*............ATTRIBUTS..............*/
	CResultContainer resultContainer;
	
	//constructeur
	CCoffee(String type){
	System.out.println(type);
    resultContainer = new CResultContainer("Votre " + type + " est prêt");  //pour l'affichage dans une nouvelle fenêtre
	}
}
