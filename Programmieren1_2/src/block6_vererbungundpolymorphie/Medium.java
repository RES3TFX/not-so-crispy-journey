package block6_vererbungundpolymorphie;

public class Medium {
	double saeumnisgebuehr;
	
	public Medium(double aSaeumnis, int anzahlTage) {
		saeumnisgebuehr=aSaeumnis*anzahlTage;
	}
	
	public double getGebuehr() {
		return saeumnisgebuehr;		
	}
	
}
