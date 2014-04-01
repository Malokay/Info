package testat5;

public class Polar {
	private double winkel;
	private double strecke;
	
	public Polar(){
		
	}
	
	
	public Polar(double winkel, double strecke){
		this.winkel=winkel;
		this.strecke=strecke;
	}

	public double getWinkel() {
		return winkel;
	}

	public void setWinkel(double winkel) {
		this.winkel = winkel;
	}

	public double getStrecke() {
		return strecke;
	}

	public void setStrecke(double strecke) {
		this.strecke = strecke;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Polar [winkel=" + winkel + ", strecke=" + strecke + "]";
	}

}
