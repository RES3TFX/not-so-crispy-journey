package block5_klassenundobjekte;

public class Buch {
	String mAutor;
	String mTitel;
	int mIdentifikationsnummer;
	boolean istAusgeliehen;

	public Buch(String aAutor, String aTitel, int aIdentifikation) {
		mAutor = aAutor;
		mTitel = aTitel;
		mIdentifikationsnummer = aIdentifikation;
		istAusgeliehen = false;

	}

	public static void druckeInformationen(Buch aBuch) {
		System.out.println(aBuch.mAutor + ", " + aBuch.mTitel + " (" + aBuch.mIdentifikationsnummer + ")");
	}

	public static void leiheAus(Buch aBuch) {
		if (aBuch.istAusgeliehen == false) {
			aBuch.istAusgeliehen = true;
			System.out.println("Das Buch wurde erfolgreich Ausgeliehen!");
		}
		System.out.println("Das Buch wurde bereits Ausgeliehen!");
	}

	public static void gibZurueck(Buch aBuch) {
		if (aBuch.istAusgeliehen == true) {
			aBuch.istAusgeliehen = false;
			System.out.println("Das Buch wurde erfolgreich zurückgegeben!");
		}
		System.out.println("Das Buch wurde gar nicht ausgeliehen!");
	}
	
	public static boolean istAusgeliehen(Buch aBuch) {
		if (aBuch.istAusgeliehen == true) {
			return true;
		}return false;
	}

}
