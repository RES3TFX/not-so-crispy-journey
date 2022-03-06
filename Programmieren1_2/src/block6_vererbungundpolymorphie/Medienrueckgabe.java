package block6_vererbungundpolymorphie;

public class Medienrueckgabe {
	double mGesamtgebuehr;
	Medium[] rueckgabe= new Medium[3];
	
	
	public Medienrueckgabe(Medium aMedium, Medium bMedium, Medium cMedium) {
		mGesamtgebuehr=0; 
		rueckgabe[0]=aMedium;
		rueckgabe[1]=bMedium;
		rueckgabe[2]=cMedium;
	}
	
	public void gibErstesMediumZurueck() {
		mGesamtgebuehr+=rueckgabe[0].saeumnisgebuehr;
		rueckgabe[0]=null;
		System.out.println("Zwischenstand Kosten: "+mGesamtgebuehr);
	}
	
	public void gibZweitesMediumZurueck() {
		mGesamtgebuehr+=rueckgabe[1].saeumnisgebuehr;
		rueckgabe[1]=null;
		System.out.println("Zwischenstand Kosten: "+mGesamtgebuehr);		
	}
	
	public void gibDrittesMediumZurueck() {
		mGesamtgebuehr+=rueckgabe[2].saeumnisgebuehr;
		rueckgabe[2]=null;
		System.out.println("Zwischenstand Kosten: "+mGesamtgebuehr);
	}	
		
}
