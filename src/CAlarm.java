import java.awt.BorderLayout;
import java.util.ArrayList;

public class CAlarm{
	//Classe repr�sentant l'objet Alarm
	
	/*............ATTRIBUTS..............*/
	CResultContainer resultContainer;

	
	//constructeur
	CAlarm(String sound){
        System.out.println(sound);
        resultContainer = new CResultContainer(sound); //pour l'affichage dans une nouvelle fen�tre
    }

}
