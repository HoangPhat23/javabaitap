
import java.util.Scanner;

public class Nhanvien {
    public String hotennv;
    public float luong;
    public int tuoi;
    public int hesoluong;
    final float luongcoban = 1490000;

    public void nhapthongtin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten nv : ");
        hotennv = sc.nextLine();
        System.out.println("Nhap tuoi nv : ");
        tuoi = sc.nextInt();
        System.out.println("Nhap he so luong : ");
        hesoluong = sc.nextInt();
    }

    public void tinhluong() {

        luong = hesoluong * luongcoban;
    }

    public void hienthongtinnhanvien() {
        System.out.printf("Ten nv %s - tuoi %d", hotennv, tuoi, luong);

    }
}