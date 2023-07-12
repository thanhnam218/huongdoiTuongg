package bai8;

import java.util.Scanner;

public class Test {

	static Scanner sc = new Scanner(System.in);
    static void nhapAlbum(CD ab) {
        System.out.print("nhap ma CD: ");
        ab.setMaCD(sc.nextInt());
        sc.nextLine();
        System.out.print("nhap ten CD : ");
        ab.setTenCD(sc.nextLine());
        System.out.print("nhap so luong bai hat : ");
        ab.setSobaihat(sc.nextInt());
        System.out.print("nhap gia CD : ");
        ab.setGia(sc.nextFloat());
    }
    public static void main(String[] args) {
        CD alb[] = null;
        int a, n = 0;
        boolean flag = true;
        do {
            System.out.println("chuc nang");
            System.out.println("1.nhap thong tin CD \n" +
                    "2.xuat danh sach CD.\n" + "3.tinh tong gia CD \n" + "4.tong so luong CD \n" +
                    "5.giam dan theo gia thanh\n"+"6.tang dan theo tua CD\n"+"nhap so 0 de thoat");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("nhap so luong CD : ");
                    n = sc.nextInt();
                    alb = new CD[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("CD thu " + (i + 1)+": ");
                        alb[i] = new CD();
                        nhapAlbum(alb[i]);
                    }
                    break;
                case 2:
                    int tong = 0;
                    for (int i = 0; i < n; i++) {
                        tong += alb[i].getGia();
                    }
                    System.out.println("" +
                            "tong gia thanh la : " + tong);
                    break;
                case 3:
                    System.out.println("tong so luong CD la : " + n);
                    break;
                case 4:
                    CD temp = alb[0];
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (alb[i].getGia() < alb[j].getGia()) {
                                temp = alb[j];
                                alb[j] = alb[i];
                                alb[i] = temp;
                            }
                        }
                    }
                    System.out.println("nhap 2 so kiem tra !");
                    break;
                case 5:
                    temp = alb[0];
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (alb[i].getTenCD().compareTo(alb[j].getTenCD())>0) {
                                temp = alb[j];
                                alb[j] = alb[i];
                                alb[i] = temp;
                            }
                        }
                    }
                    System.out.println("Sắp xếp thành công, Nhập số 2 để kiểm tra!");
                    break;
                default:
                    System.out.println("Goodbye");
                    flag = false;
                    break;
            }
        }while (flag) ;
    }

}
