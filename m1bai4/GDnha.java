package m1bai4;

public class GDnha extends Giaodich{

	private String loaiNha;
	private String diaChi;
	private int choose;
	
	public GDnha() {}
	public GDnha(String loaiNha, String diaChi, int choose) {
		super();
		this.loaiNha = loaiNha;
		this.diaChi = diaChi;
		this.choose = choose;
	}

	public String getLoaiNha() {
		return loaiNha;
	}

	public void setLoaiNha(String loaiNha) {
		this.loaiNha = loaiNha;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public int getChoose() {
		return choose;
	}

	public void setChoose(int choose) {
		this.choose = choose;
	}

	public void nhap() {
		System.out.print("nhap dia chi");
		diaChi = scanner.nextLine();
		System.out.print("nhap loai nha(1/2)");
		loaiNha = scanner.nextLine();
		choose = scanner.nextInt();
		switch(choose) {
		case 1:
			loaiNha ="cao cap";
			break;
		case 2:
			loaiNha ="thuong";
			break;
		default:
			System.out.println("chon ko hop le");
			break;
		}

	}
	@Override
	public String toString() {
		return "GDnha [loaiNha=" + loaiNha + ", diaChi=" + diaChi + ", choose=" + choose + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
