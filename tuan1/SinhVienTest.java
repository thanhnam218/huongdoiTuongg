package tuan1;

import java.util.Scanner;

public class SinhVienTest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		SinhVien sv1= new SinhVien(12345, "thu ha", 6.5f, 8.5f);
		SinhVien sv2= new SinhVien(56789, "thu hoa", 6.0f, 8.2f);
		SinhVien sv3= new SinhVien();
		System.out.println("nhap mssv:");
		int masv=sc.nextInt();
		sc.nextLine();
		System.out.println("nhap ten sv:");
		String hoten=sc.nextLine();
		System.out.println("nhap diem LT:");
		float diemlt=sc.nextFloat();
		System.out.println("nhap diem TH:");
		float diemth=sc.nextFloat();
		
		sv3.setMaSV(masv);
		sv3.setTen(hoten);
		sv3.setDiemLT(diemlt);
		sv3.setDiemTH(diemth);
		
		System.out.println(String.format("%-5s %-30s %10s %10s %10s","masv","hoten","diemlt","diemth","diemtb"));
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
		sc.close();
	}
}
