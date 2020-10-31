import java.util.Scanner;

public class App {
	
	public static void main(String[] args)
    {
		Scanner inputAlarm = new Scanner(System.in);
		
		
		//choix de l'utilisateur
		System.out.println("Voyez choisir votre heure de reveil . (nb:nb:nb)");
		String alarm = inputAlarm.nextLine();
		
		//!PENSER AUX EXCEPTIONS
		
		//le réveil est doté d'une alarme
		CAlarmAlarmClock alarmAlarmClock1 = new CAlarmAlarmClock(alarm); 
		
		//lancement de l'alarme
		alarmAlarmClock1.rool();
		
    }
}
