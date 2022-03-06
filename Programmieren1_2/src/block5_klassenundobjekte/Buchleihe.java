package block5_klassenundobjekte;

public class Buchleihe {

	Buch mBuch;
	String mKunde;

	public Buchleihe(Buch aBuch, String aKunde) {
		mBuch = aBuch;
		mKunde = aKunde;
	}

	public static void leiheBuchAus(Buch aBuch) {
		if (Buch.istAusgeliehen(aBuch) == false) {
			aBuch.istAusgeliehen=true;
			System.out.println("Buch erfolgreich verliehen.");
		}else{System.out.println("Buch bereits verliehen.");
		}
		

	}

	public static void gibBuchZur�ck(Buch aBuch) {
		if (Buch.istAusgeliehen(aBuch) == true) {
			aBuch.istAusgeliehen=false;
			System.out.println("R�ckgabe erfolgreich.");
		}else{System.out.println("Buch bereits zur�ckgegeben.");}

	}
}
