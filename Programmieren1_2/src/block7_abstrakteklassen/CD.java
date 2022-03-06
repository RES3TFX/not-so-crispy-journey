package block7_abstrakteklassen;

public class CD extends Medium{
	public CD(int aIdent) {
		super(aIdent);
		super.mLeihfrist=2;
	}
	public int getLeihfrist() {
		return this.mLeihfrist;	
	}

}
