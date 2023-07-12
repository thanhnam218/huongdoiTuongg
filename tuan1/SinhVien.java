package tuan1;



public class SinhVien {

	private int maSV;
	private String hoTen;
	private float diemLT;
	private float diemTH;
	
	public SinhVien() {
		this(0,"",0.0f,0.0f);
	}
	public SinhVien(int maSV, String hoTen,float diemLT, float diemTH) {
		setMaSV(maSV);
		setTen(hoTen);
		setDiemLT(diemLT);
		setDiemTH(diemTH);
	}
	
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		if(maSV < 0)
			this.maSV=0;
		else 
			this.maSV=maSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public float getDiemLT() {
		return diemLT;
	}
	public void setDiemLT(float diemLT) {
		if(diemLT>=0 && diemLT<=10)
			this.diemLT=diemLT;
		else
			this.diemLT=0;
	}
	public float getDiemTH() {
		return diemTH;
	}
	public void setDiemTH(float diemTH) {
		if(diemTH>=0 && diemTH<=10)
			this.diemTH=diemTH;
		else
			this.diemTH=0;
	}
	
	public float diemTB() {
		return(diemLT + diemTH)/2;
	}
	
	public String toString() {
		return String.format("%-5s %-30s %10.2f %10.2f %10.2f",maSV,hoTen,diemLT,diemTH,diemTB());
	}
	
		
}
