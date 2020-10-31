import java.util.Scanner;

public class App {
	
	public static void main(String[] args)
    {
		//va r�cup�rer le texte tap� dans la console
		Scanner inputAlarm = new Scanner(System.in);
		
		//choix de l'utilisateur
		
		/*.........................REVEIL...................................*/
		
		System.out.println("Dans combien de temps voulez vous vous r�veiller ?");
		
		//nous n'avons pas d'heure limit�, nous pouvons tr�s bien nous r�veiller dans 15 heures
		System.out.println("Choisissez un nombre d'heure : ");
		String heure = inputAlarm.nextLine();
		
		//nous ne pouvons pas donner un nombre de minute sup�rieur � 59
		//booleen qui va v�rifier que le nombre de minute tap� est bon
		boolean minutesAreOk = false;
		String minute = "0";
		//tant que le nombre de minute tap� n'est as bon, on demande � l'utilisateur de le rentrer
		while(minutesAreOk == false) {
			System.out.println("Choisissez un nombre de minute : ");
			minute = inputAlarm.nextLine();
			//si le nombre de minute est sup�rieur � 59 la condition n'est pas valid�
			if(Integer.parseInt(minute) > 59) System.out.println("Erreur: Entrez un nombre de minutes inf�rieur � 60");
			if(Integer.parseInt(minute)<60) minutesAreOk = true;
		}
		
		//nous ne pouvons pas donner un nombre de seconde sup�rieur � 59
		boolean secondsAreOk = false;
		String seconde = "0";
		while(secondsAreOk == false) {
			System.out.println("Choisissez un nombre de seconde : ");
			seconde = inputAlarm.nextLine();
			if(Integer.parseInt(seconde) > 59) System.out.println("Erreur: Entrez un nombre de seconde inf�rieur � 60");
			if(Integer.parseInt(seconde)<60) secondsAreOk = true;
		}
		
		//!PENSER AUX EXCEPTIONS
		
		//le r�veil est dot� d'une alarme
		CAlarmAlarmClock alarmAlarmClock1 = new CAlarmAlarmClock(heure + ":" + minute + ":" + seconde); 
		
		//lancement de l'alarme
		alarmAlarmClock1.rool();
		
    }
}
