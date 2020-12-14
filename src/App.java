import java.util.Scanner;

public class App {
	
	//d�commenter la version console pour l'utiliser
	
	static CWindow windowMenu ; //utilis� dans la version application
	static String heure, minutes, secondes; //utilis� dans la version console
	
	public static void main(String[] args)
    {
		/*..................MODE APPLICATION.............*/

		windowMenu = new CWindow();
		if(windowMenu.isReload == true) {
			System.out.println("eeeee");
		}
		
		/*...................MODE CONSOLE.................*/
/*
		userInteractions();
		//v�rifie si l'utilisateur a choisi un objet
		boolean isChoised = false ;
		
		while(isChoised == false) {
			//pour l'objet � utiliser
			Scanner inputObject = new Scanner(System.in);
			
			//choix de l'utilisateur
			//choisir l'objet � utiliser
			System.out.println("Quel objet voulez vous utiliser ? ");
			System.out.println("1 - Reveil");
			System.out.println("2 - Radio");
			System.out.println("3 - Machine a cafe");
			int choise = inputObject.nextInt();
			
			switch(choise){
				 //choix du r�veil
				case 1: goAlarmClock(); isChoised = true;
					break;
				//choix de la radio
				case 2: goRadio(); isChoised = true ;
					break;
				//choix de la machine � caf�
				case 3: goCafe(); isChoised = true;
					break;
				default : System.out.println("Erreur: vous n'avez rien choisi !");
			}
		}	
    }
	
	//REVEIL
	public static void goAlarmClock() {
		//System.out.println("Dans combien de temps voulez vous vous r�veiller ?");
		
		//userInteractions();
		
		//Cr�ation de l'alarme
		CRingingAlarmClock RingingAlarmClock = new CRingingAlarmClock(heure + ":" + minutes + ":" + secondes,1);
								
		//lancement de l'alarme
		RingingAlarmClock.rool();
	}
	
	//RADIO
	public static void goRadio() {
		//System.out.println("Dans combien de temps voulez vous mettre en route la radio ?");
		
		//userInteractions();
		
		//Cr�ation de l'alarme
		CRadioAlarmClock radioAlarmClock1 = new CRadioAlarmClock(heure + ":" + minutes + ":" + secondes, 3);
										
		//lancement de l'alarme
		radioAlarmClock1.rool();
	}
	
	//CAFE
	public static void goCafe() {
		//System.out.print("Dans combien de temps voulez vous avoir votre cafe de pret ? ");
		
		//userInteractions();
		
		//Cr�ation de l'alarme
		CCoffeeAlarmClock coffeeAlarmClock1 = new CCoffeeAlarmClock(heure + ":" + minutes + ":" + secondes,0);
										
		//lancement de l'alarme
		coffeeAlarmClock1.rool();
	}
	
	//interactions utilisateur
	public static void userInteractions() {
		
		System.out.println("Bienvenue");
		//va r�cup�rer le texte tap� dans la console pour l'heure
		Scanner inputAlarm = new Scanner(System.in);
		
		//nous n'avons pas d'heure limite, nous pouvons tres bien nous reveiller dans 15 heures
		System.out.println("Choisissez un nombre d'heure : ");
		heure = inputAlarm.nextLine();
		
		//nous ne pouvons pas donner un nombre de minute superieur a 59
		//booleen qui va verifier que le nombre de minute entré par l'user est bon
		boolean minutesAreOk = false;
		//tant que le nombre de minute tap� n'est as bon, on demande � l'utilisateur de le rentrer
		while(minutesAreOk == false) {
			System.out.println("Choisissez un nombre de minute : ");
			minutes = inputAlarm.nextLine();
			//si le nombre de minute est sup�rieur � 59 la condition n'est pas valid�
			if(Integer.parseInt(minutes) > 59) System.out.println("Erreur: Entrez un nombre de minutes inferieur a 60");
			if(Integer.parseInt(minutes)<60) minutesAreOk = true;
		}
		
		//nous ne pouvons pas donner un nombre de seconde sup�rieur � 59
		boolean secondsAreOk = false;
		while(secondsAreOk == false) {
			System.out.println("Choisissez un nombre de seconde : ");
			secondes = inputAlarm.nextLine();
			if(Integer.parseInt(secondes) > 59) System.out.println("Erreur: Entrez un nombre de seconde inferieur a 60");
			if(Integer.parseInt(secondes)<60) secondsAreOk = true;
		}
*/
	}
		
}
