package m1bai4;

import java.util.Date;
import java.util.Scanner;

public class Giaodich {
	private String maGD;
	private long donGia;
	private Date ngayGD;
	private float dientich;
	Scanner scanner = new Scanner(System.in);
	
	public Giaodich() {}
	public Giaodich(String maGD, long donGia, Date ngayGD, float dientich) {
		super();
		this.maGD = maGD;
		this.donGia = donGia;
		this.ngayGD = ngayGD;
		this.dientich = dientich;
	}

	public String getMaGD() {
		return maGD;
	}

	public void setMaGD(String maGD) {
		this.maGD = maGD;
	}

	public long getDonGia() {
		return donGia;
	}

	public void setDonGia(long donGia) {
		this.donGia = donGia;
	}

	public Date getNgayGD() {
		return ngayGD;
	}

	public void setNgayGD(Date ngayGD) {
		this.ngayGD = ngayGD;
	}

	public float getDientich() {
		return dientich;
	}

	public void setDientich(float dientich) {
		this.dientich = dientich;
	}

	@Override
	public String toString() {
		return "Giaodich [maGD=" + maGD + ", donGia=" + donGia + ", ngayGD=" + ngayGD + ", dientich=" + dientich
				+ ", scanner=" + scanner + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
