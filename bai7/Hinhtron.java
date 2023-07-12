package bai7;

import java.util.Scanner;

public class Hinhtron {

	private Toado tam;
	private double bankinh;

	public Hinhtron(Toado tam, double bankinh) {
		this.tam = tam;
		this.bankinh = bankinh;
	}

	public Toado getTam() {
		return tam;
	}

	public void setTam(Toado tam) {
		this.tam = tam;
	}

	public double getBankinh() {
		return bankinh;
	}

	public void setBankinh(double bankinh) {
		this.bankinh = bankinh;
	}

	public float getDientich() {
		return (float) (bankinh*bankinh*3.14);
		}
	public float getChuvi() {
		return (float) ((bankinh*2)*3.14);
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Toado  xy= new Toado();
		System.out.println("nhap toa do x: ");
		float diemx = sc.nextFloat();
		sc.nextLine();
		System.out.println("nhap toa do y: ");
		float diemy = sc.nextFloat();
		//System.out.println("nhap ten toa do: ");
		//String tenxy = sc.nextLine();

		//xy.setTen(tenxy);
		xy.setX(diemx);
		xy.setY(diemy);
		
		sc.close();
	}
	public String toString() {
		return String.format("hinh tron tam O(%f,%f) voi ban kinh %f co dien tich va chu vi lan luot la %f va %f ",bankinh,getChuvi(),getDientich());
		}
}
