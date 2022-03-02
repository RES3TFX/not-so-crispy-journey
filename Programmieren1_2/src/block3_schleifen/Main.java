package block3_schleifen;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		zahlenAddierenFor(3);
		zahlenAddierenWhile(3);
		zahlDividierenFor(1024);
		zahlDividierenWhile(1024);
	}
	//Aufgabe 8
	public static int zahlenAddierenFor(int n) {
		int laufvariable=1;
		int z=1;
		for(int i=0;i<n;i++) {
			laufvariable+=z;
			z++;
		}
		
		System.out.println("Der errechnete Wert:"+laufvariable);
		return laufvariable;
	}
	public static int zahlenAddierenWhile(int n) {
		int laufvariable=1;
		int z=1;
		int i=0;
		while(i<n){
			laufvariable+=z;
			z++;
			i++;
		}
		System.out.println("Der errechnete Wert:"+laufvariable);
		return laufvariable;
	}
	
	//Aufgabe 9
	public static int zahlDividierenFor(int uebergabeZahl) {
		int laufzeit=0;
		for(int i=0;uebergabeZahl!=1;i++) {
			uebergabeZahl/=2;
			laufzeit++;
			}System.out.println(laufzeit+" und Ergebnis "+ uebergabeZahl);
		return uebergabeZahl;
	}
	
	public static void zahlDividierenWhile(int uebergabeZahl) {
		int laufzeit=0;
		while(uebergabeZahl!=1) {
			uebergabeZahl/=2;
			laufzeit++;
		}System.out.println(laufzeit+" und Ergebnis "+ uebergabeZahl);
		
	}
	
	//Aufgabe 11 - Hab Utils nicht
	
	/*public static void findeZufallszahl() {
		int zufallszahl= Utils.createIntZufallszahl();
	}*/

}
