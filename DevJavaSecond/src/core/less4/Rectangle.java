package core.less4;

public class Rectangle implements Geometric{

	private int a;
	private int b;
	
	public Rectangle(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public int square() {
		return a*b;
	}

	@Override
	public int perimetr() {
		return 2*(a+b);
	}
}
