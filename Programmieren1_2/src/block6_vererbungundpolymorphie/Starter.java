package block6_vererbungundpolymorphie;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buch aBuch = new Buch(5);
		getGebuehr(aBuch);
		CD aCD = new CD(2);
		getGebuehr(aCD);
		Film aFilm = new Film(10);
		getGebuehr(aFilm);
		Medienrueckgabe medien = new Medienrueckgabe(aBuch, aCD, aFilm);
		medien.gibErstesMediumZurueck();
		medien.gibZweitesMediumZurueck();
		medien.gibDrittesMediumZurueck();
		
	}
	
	public static double getGebuehr(Medium aMedium) {
		System.out.println(aMedium.saeumnisgebuehr);
		return aMedium.saeumnisgebuehr;
	}

}
