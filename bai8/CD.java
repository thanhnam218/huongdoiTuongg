package bai8;

public class CD {

	private int maCD;
	private String tenCD;
	private int sobaihat;
	private double gia;
	
	public CD() {}
	public CD(int maCD,String tenCD,int sobaihat,double gia ) {
		this.maCD=maCD;
		this.tenCD=tenCD;
		this.sobaihat=sobaihat;
		this.gia=gia;
	}
	
	public int getMaCD() {
		return maCD;
	}


	public void setMaCD(int maCD) {
		this.maCD = maCD;
	}


	public String getTenCD() {
		return tenCD;
	}


	public void setTenCD(String tenCD) {
		this.tenCD = tenCD;
	}


	public int getSobaihat() {
		return sobaihat;
	}


	public void setSobaihat(int sobaihat) {
		if(sobaihat > 0)
			this.sobaihat = sobaihat;
		else
			this.sobaihat = 0;
	}


	public double getGia() {
		return gia;
	}


	public void setGia(double gia) {
		if(gia > 0)
			this.gia = gia;
		else
			this.gia = 0;
	}
	
	
	@Override
	public String toString() {
		return "CD [maCD=" + maCD + ", tenCD=" + tenCD + ", sobaihat=" + sobaihat + ", gia=" + gia + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
