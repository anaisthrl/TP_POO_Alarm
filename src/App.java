import java.util.Scanner;

public class App {
	
	public static void main(String[] args)
    {
		//va récupérer le texte tapé dans la console
		Scanner inputAlarm = new Scanner(System.in);
		
		//choix de l'utilisateur
		
		/*.........................REVEIL...................................*/
		
		System.out.println("Dans combien de temps voulez vous vous réveiller ?");
		
		//nous n'avons pas d'heure limité, nous pouvons très bien nous réveiller dans 15 heures
		System.out.println("Choisissez un nombre d'heure : ");
		String heure = inputAlarm.nextLine();
		
		//nous ne pouvons pas donner un nombre de minute supérieur à 59
		//booleen qui va vérifier que le nombre de minute tapé est bon
		boolean minutesAreOk = false;
		String minute = "0";
		//tant que le nombre de minute tapé n'est as bon, on demande à l'utilisateur de le rentrer
		while(minutesAreOk == false) {
			System.out.println("Choisissez un nombre de minute : ");
			minute = inputAlarm.nextLine();
			//si le nombre de minute est supérieur à 59 la condition n'est pas validé
			if(Integer.parseInt(minute) > 59) System.out.println("Erreur: Entrez un nombre de minutes inférieur à 60");
			if(Integer.parseInt(minute)<60) minutesAreOk = true;
		}
		
		//nous ne pouvons pas donner un nombre de seconde supérieur à 59
		boolean secondsAreOk = false;
		String seconde = "0";
		while(secondsAreOk == false) {
			System.out.println("Choisissez un nombre de seconde : ");
			seconde = inputAlarm.nextLine();
			if(Integer.parseInt(seconde) > 59) System.out.println("Erreur: Entrez un nombre de seconde inférieur à 60");
			if(Integer.parseInt(seconde)<60) secondsAreOk = true;
		}
		
		//!PENSER AUX EXCEPTIONS
		
		//le réveil est doté d'une alarme
		CAlarmAlarmClock alarmAlarmClock1 = new CAlarmAlarmClock(heure + ":" + minute + ":" + seconde); 
		
		//lancement de l'alarme
		alarmAlarmClock1.rool();
		
    }
}
