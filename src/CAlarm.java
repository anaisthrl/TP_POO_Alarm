import java.awt.BorderLayout;
import java.util.ArrayList;

public class CAlarm{
	//Classe repr�sentant l'objet Alarm
	
	/*............ATTRIBUTS..............*/
	CResultContainer resultContainer; //repr�sente le panel o� va �tre �crite l'alarme

	
	//constructeur
	CAlarm(String sound){
        System.out.println(sound); //pour l'affichage dans la console
        resultContainer = new CResultContainer(sound); //pour l'affichage dans une nouvelle fen�tre
    }

}
