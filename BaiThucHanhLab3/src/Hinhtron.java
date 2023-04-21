import java.util.Scanner;

public class Hinhtron {
  
    public float r;
    public float Chuvi;
    public float Dientich;
    final float pI = 3.14f;

    public void Nhapbankinh() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ban kinh r =");
        r = sc.nextFloat();
    }

    public void tinhChuvi() {
        Chuvi = 2 * pI * r;
    }

    public void tinhDientich() {
        Dientich = pI * r * r;

    }

    public void Hienthichuvi() {
        System.out.printf("Chu vi hinh tron %2f", Chuvi);
    }
}