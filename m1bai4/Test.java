package m1bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<GDnha> arrNha = new ArrayList<GDnha>();
		ArrayList<GDdat> arrDat = new ArrayList<GDdat>();
		int soGDdat=0, soGDnha=0;
		long tongTienGDdat=0, thanhtien=0;
		Scanner scanner=new Scanner(System.in);
		//
		System.out.print("nhap so giao dich dat: ");
		soGDdat =scanner.nextInt();
		System.out.print("nhap so giao dich nha: ");
		soGDnha =scanner.nextInt();
		//
		System.out.println("nhap thong tin giao dich dat ");
		for(int i=0;i<soGDdat;i++) {
			System.out.println("thong tin giao dich dat thu "+(i+1));
			GDdat giaodichdat= new GDdat();
			giaodichdat.nhap();
			arrDat.add(giaodichdat);
		}
		System.out.println("nhap thong tin giao dich nha ");
		for(int i=0;i<soGDnha;i++) {
			System.out.println("thong tin giao dich nha thu "+(i+1));
			GDnha giaodichnha= new GDnha();
			giaodichnha.nhap();
			arrNha.add(giaodichnha);
		}
		//
		System.out.println("cac thong tin giao dich dat");
		for(int i=0;i<arrNha.size();i++) {
			System.out.println(arrDat.get(i).toString());
		}
		System.out.println("cac thong tin giao dich nha");
		for(int i=0;i<arrNha.size();i++) {
			System.out.println(arrNha.get(i).toString());
		}
	}

}
