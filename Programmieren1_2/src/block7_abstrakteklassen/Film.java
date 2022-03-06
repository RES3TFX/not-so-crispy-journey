package block7_abstrakteklassen;

public class Film extends Medium{
	
	public Film(int aIdent) {
		super(aIdent);
		super.mLeihfrist=1;
	}
	public int getLeihfrist() {
		return this.mLeihfrist;	
	}

}
