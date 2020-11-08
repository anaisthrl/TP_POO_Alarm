# TP_POO_Alarm
 
 ** Etudiants: LAVAL Alexandre et THORAL Anaïs
 
 ** Consigne: Réaliser une application dans laquelle nous pouvons activer un réveil, une machine à caffée ou la radio à partir d'un compteur. 

 ** Pour ce qui est du nom des classes (voir dans le diagramme_classe.png) :
 - compteur <=> CCounter
 - chaine de compteur <=> CCounterChain
 - montre <=> CWatch
 - réveil <=> CAlarmClock
 - réveil radio <=> CRadioAlarmClock
 - réveil sonnerie <=> CAlarmAlarmClock
 - réveil cafetière <=> CCoffeeAlarmClock
 - declenchable <=> ITrigger
 - sonnerie déclenchable <=> CAlarmTrigger
 - sonnerie <=> CAlarm
 - radio déclenchable <=> CRadioTrigger
 - radio <=> CRadio
 - cafetière déclenchable <=> CCoffeeTrigger
 - cafetière <=> CCoffee
 
 Les classes suivantes sont strictement utilisées pour l'interface graphique de l'application: 
 - CResultContainer
 - CWindow
 - CWindowResult

** Utilisation (version graphique) **
Une fois l'application ouverte vous pouvez entrer un temps d'attente avant qu'une action (réveil, machine à café, radio) se mette en marche. ! le temps 0:0:0 ne marche pas !
Ensuite choisissez l'objet, une fois choisi, vous ne pourrez pas revenir en arrière. 
Vous pouvez apprésent valider votre choix et attendre pour voir le résultat !

** A améliorer **
(version graphique) Nous aurions voulu afficher le compteur sur notre fenêtre pour que l'utilisateur voit le temps qu'il lui reste à attendre, malheureusement il aurait fallu utiliser la méthode du multi threading mais nous n'avons pas eu assez de temps.
