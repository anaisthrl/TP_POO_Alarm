import java.awt.BorderLayout;

public class CAlarm{
	
	//Classe représentant l'objet Alarm
	/*............ATTRIBUTS..............*/
	CWindowResult windowResult;
	CResultContainer resultContainer;
	
	//constructeur
	CAlarm(String sound){
        System.out.println(sound);
        windowResult = new CWindowResult();
        resultContainer = new CResultContainer(sound);
        windowResult.setResultContainer(this.resultContainer);
    }

}
