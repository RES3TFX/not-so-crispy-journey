package block7_abstrakteklassen;

public class Buch extends Medium {
	
	public Buch(int aIdent) {
		super(aIdent);
		super.mLeihfrist=4;
	}
	public int getLeihfrist() {
		return this.mLeihfrist;	
	}

}
