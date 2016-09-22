package latihan2;

public class DimensionalShape {
//property (private)
	private int numSide;
	private boolean regular;

//default constructor
	public DimensionalShape(){
		numSide=0;
		regular=true;
	}

//parameters constructor
	public DimensionalShape(int numSide, boolean regular){
		this.numSide=numSide;
		this.regular=regular;
	}
	
//-----------
	public int getNumSide() {
		return numSide;
	}
	public void setNumSide(int numSide) {
		this.numSide = numSide;
	}

//-----------	
	public boolean isRegular() {
		return regular;
	}
	public void setRegular(boolean regular) {
		this.regular = regular;
	}
}
