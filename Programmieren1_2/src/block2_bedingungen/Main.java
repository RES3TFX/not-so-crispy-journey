package block2_bedingungen;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gueltigerMonat(1);
		gueltigerMonat(13);
		meterologischeJahreszeit(7);
		meterologischeJahreszeit(13);
		bestimmungMonat(11);
		bestimmungMonat(0);
		
	}
public static boolean gueltigerMonat(int monat) {
	if(monat>0&&monat<12) {
		System.out.println("Die Eingabe ist gültig!");
		return true;
	}System.out.println("Die Eingabe ist nicht gültig!");
	return false;
}

public static boolean meterologischeJahreszeit(int monat) {
	switch(monat) {
		case 3,4,5:
			System.out.println("Fruehling");
			return true;
		case 6,7,8:
			System.out.println("Sommer");
			return true;
		case 9,10,11: 
			System.out.println("Herbst");
			return true;
		case 12,1,2:
			System.out.println("Winter");
			return true; 
			
}
	System.out.println("Es wurde kein gültiger Monat eingegeben.");
	return false;
}

public static boolean bestimmungMonat(int monat) {
	switch(monat) {
		case 1:
			System.out.println("Januar");
			return true;
		case 2:
			System.out.println("Februar");
			return true;
		case 3: 
			System.out.println("März");
			return true;
		case 4:
			System.out.println("April");
			return true;
		case 5:
			System.out.println("Mai");
			return true;
		case 6:
			System.out.println("Juni");
			return true;
		case 7:
			System.out.println("Juli");
			return true;
		case 8:
			System.out.println("August");
			return true;
		case 9:
			System.out.println("September");
			return true;
		case 10:
			System.out.println("Oktober");
			return true;
		case 11:
			System.out.println("NNN");
			return true;
		case 12:
			System.out.println("Dezember");
			return true;
			
}
	System.out.println("Es wurde kein gültiger Monat eingegeben.");
	return false;

}
}
