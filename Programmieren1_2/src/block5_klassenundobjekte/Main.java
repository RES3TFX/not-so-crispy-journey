package block5_klassenundobjekte;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buch kapitalBuch = new Buch("Karl Marx", "Das Kapital", 214748364);
		Buchleihe leihe = new Buchleihe(kapitalBuch, "Friedrich Engels");

		Buch.druckeInformationen(kapitalBuch);
		Buchleihe.leiheBuchAus(kapitalBuch);
		Buchleihe.leiheBuchAus(kapitalBuch);
		Buchleihe.gibBuchZurück(kapitalBuch);
		Buchleihe.gibBuchZurück(kapitalBuch);

	

	}

}
