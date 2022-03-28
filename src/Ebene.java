
public class Ebene {

	private double x;
	private double y;
	private int berechnungen;
	
	public Ebene(double x, double y) {
		this.x = x;
		this.y = y;
		this.berechnungen = -1;
	}
	
	
	public Ebene(double x, double y, int berechnungen) {
		this.x = x;
		this.y = y;
		this.berechnungen = berechnungen;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public int GetBerechnungen() {
	return this.berechnungen;	
	
	}
	
	
}
