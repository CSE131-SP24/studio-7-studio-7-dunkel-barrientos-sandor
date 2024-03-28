package studio7;

public class Die {

	private int n;
	
	public Die(int n) {
		this.n = n;
	}
	public int Getn() {
		return this.n;
		}
	public int NumSides() {
		 int NumSides  = (int) ((n * Math.random()) + 1);
		 return NumSides;
	}
	
	public static void main(String[] args) {
		Die NumSides = new Die(7);
		System.out.println(NumSides.NumSides());
	}
	
}

