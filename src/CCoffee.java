public class CCoffee {
	//Classe repr�sentant l'objet Machine � Caf�
	
	/*............ATTRIBUTS..............*/
	CResultContainer resultContainer;
	
	//constructeur
	CCoffee(String type){
	System.out.println(type);
    resultContainer = new CResultContainer("Votre " + type + " est pr�t");  //pour l'affichage dans une nouvelle fen�tre
	}
}
