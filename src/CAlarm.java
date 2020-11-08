import java.awt.BorderLayout;
import java.util.ArrayList;

public class CAlarm{
	//Classe représentant l'objet Alarm
	
	/*............ATTRIBUTS..............*/
	CResultContainer resultContainer; //représente le panel où va être écrite l'alarme

	
	//constructeur
	CAlarm(String sound){
        System.out.println(sound); //pour l'affichage dans la console
        resultContainer = new CResultContainer(sound); //pour l'affichage dans une nouvelle fenêtre
    }

}
