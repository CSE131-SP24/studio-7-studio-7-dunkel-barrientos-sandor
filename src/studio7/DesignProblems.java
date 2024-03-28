package studio7;

public class DesignProblems {

	//instance variable: declares that this variable exists in this class too
	private int length;
	private int width;

	//constructor
	public DesignProblems(int length, int width) {
		this.length = length;
		this.width = width;
	

	}
	//getters/accessor methods
	public int getLength() {
		return this.length;
	}
	public int getWidth() {
		return this.width;
	}
	
	public int rectangleArea() {
		 int area = this.length * this.width;
		 return area;
	
	}
	 public static void main(String[] args) {
		 DesignProblems area = new DesignProblems (5, 10);
		 System.out.println(area.rectangleArea());
		 
	 }
	 
}
