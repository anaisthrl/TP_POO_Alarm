import java.util.Scanner;

public class App {
	
	static CWindow windowMenu ;
	static String heure, minutes, secondes;
	
	public static void main(String[] args)
    {
		/*..................MODE APPLICATION.............*/
		
		windowMenu = new CWindow();

		/*...................MODE CONSOLE.................*/
		/*userInteractions();
		//vérifie si l'utilisateur a choisi un objet
		boolean isChoised = false ;
		
		while(isChoised == false) {
			//pour l'objet à utiliser
			Scanner inputObject = new Scanner(System.in);
			
			//choix de l'utilisateur
			//choisir l'objet à utiliser
			System.out.println("Quel objet voulez vous utiliser ? ");
			System.out.println("1 - Réveil");
			System.out.println("2 - Radio");
			System.out.println("3 - Machine à café");
			int choise = inputObject.nextInt();
			
			switch(choise){
				 //choix du réveil
				case 1: goAlarmClock(); isChoised = true;
					break;
				//choix de la radio
				case 2: goRadio(); isChoised = true ;
					break;
				//choix de la machine à café
				case 3: goCafe(); isChoised = true;
					break;
				default : System.out.println("Erreur: vous n'avez rien choisi !");
			}
		}	
    }
	
	//REVEIL
	public static void goAlarmClock() {
		//System.out.println("Dans combien de temps voulez vous vous réveiller ?");
		
		//userInteractions();
		
		//Création de l'alarme
		CAlarmAlarmClock alarmAlarmClock1 = new CAlarmAlarmClock(heure + ":" + minutes + ":" + secondes); 
								
		//lancement de l'alarme
		alarmAlarmClock1.rool();
	}
	
	//RADIO
	public static void goRadio() {
		//System.out.println("Dans combien de temps voulez vous mettre en route la radio ?");
		
		//userInteractions();
		
		//Création de l'alarme
		CRadioAlarmClock radioAlarmClock1 = new CRadioAlarmClock(heure + ":" + minutes + ":" + secondes); 
										
		//lancement de l'alarme
		radioAlarmClock1.rool();
	}
	
	//CAFE
	public static void goCafe() {
		//System.out.print("Dans combien de temps voulez vous avoir votre café de prêt ? ");
		
		//userInteractions();
		
		//Création de l'alarme
		CCoffeeAlarmClock coffeeAlarmClock1 = new CCoffeeAlarmClock(heure + ":" + minutes + ":" + secondes); 
										
		//lancement de l'alarme
		coffeeAlarmClock1.rool();
	}
	
	//interactions utilisateur
	public static void userInteractions() {
		
		System.out.println("Bienvenue");
		//va récupérer le texte tapé dans la console pour l'heure
		Scanner inputAlarm = new Scanner(System.in);
		
		//nous n'avons pas d'heure limité, nous pouvons très bien nous réveiller dans 15 heures
		System.out.println("Choisissez un nombre d'heure : ");
		heure = inputAlarm.nextLine();
		
		//nous ne pouvons pas donner un nombre de minute supérieur à 59
		//booleen qui va vérifier que le nombre de minute tapé est bon
		boolean minutesAreOk = false;
		//tant que le nombre de minute tapé n'est as bon, on demande à l'utilisateur de le rentrer
		while(minutesAreOk == false) {
			System.out.println("Choisissez un nombre de minute : ");
			minutes = inputAlarm.nextLine();
			//si le nombre de minute est supérieur à 59 la condition n'est pas validé
			if(Integer.parseInt(minutes) > 59) System.out.println("Erreur: Entrez un nombre de minutes inférieur à 60");
			if(Integer.parseInt(minutes)<60) minutesAreOk = true;
		}
		
		//nous ne pouvons pas donner un nombre de seconde supérieur à 59
		boolean secondsAreOk = false;
		while(secondsAreOk == false) {
			System.out.println("Choisissez un nombre de seconde : ");
			secondes = inputAlarm.nextLine();
			if(Integer.parseInt(secondes) > 59) System.out.println("Erreur: Entrez un nombre de seconde inférieur à 60");
			if(Integer.parseInt(secondes)<60) secondsAreOk = true;
		}*/
	}
		
}
