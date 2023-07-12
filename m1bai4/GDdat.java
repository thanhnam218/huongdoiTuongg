package m1bai4;

public class GDdat extends Giaodich {

	private String loaiDat;
	public GDdat() {}	
	public GDdat(String loaiDat) {
		super();
		this.loaiDat = loaiDat;
	}

	public String getLoaiDat() {
		return loaiDat;
	}

	public void setLoaiDat(String loaiDat) {
		this.loaiDat = loaiDat;
	}

	public void nhap() {
		System.out.print("nhap loai dat(A/B/C): ");
		loaiDat = scanner.nextLine();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
