package bai7;

public class Toado {
	private String ten;
	private float x;
	private float y;
	
	public Toado(String ten, float x, float y) {
		this.ten = ten;
		this.x = x;
		this.y = y;
	}
	
	public Toado() {
		// TODO Auto-generated constructor stub
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public float getX() {
		return x;
	}

	public void setX(float diemx) {
		if(diemx > 0)
			this.x = diemx;
		else
			this.x = 0;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		if(y > 0)
			this.y = y;
		else
			this.y = 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
