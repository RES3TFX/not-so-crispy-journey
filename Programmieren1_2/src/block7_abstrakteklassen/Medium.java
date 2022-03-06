package block7_abstrakteklassen;

public abstract class Medium {
	int mIdentifikationsnummer; 
	int mLeihfrist;
	
	public Medium(int aIdent) {
		mIdentifikationsnummer=aIdent;
		
	}
	public int getId() {
		return this.mIdentifikationsnummer;
	}
	protected abstract int getLeihfrist();
	
	public String toString(){
		return "Das Buch mit der ID "+ this.getId()+ " hat eine Leihfrist von "+ this.getLeihfrist()+ " Wochen.";
		 
	}

	
	
	
	
}
