
import java.util.Scanner;

public class Hinhtrutron {

    public float bankinh = 0;
    public float chieucao = 0;
    public float chuvi = 0;
    public float dientich = 0;
    public float thetich = 0;
    final float PI = 3.14f;

    public void Nhapbankinhhtt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh : ");
        bankinh = sc.nextFloat();
    }

    public void nhapChieucaohtt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu cao : ");
        chieucao = sc.nextFloat();
    }

    public float tinhChuvihtt() {
        return chuvi = 2 * PI * bankinh;
    }

    public float tinhDientichhtt() {
        return dientich = 2 * PI * bankinh * (bankinh + chieucao);
    }

    public float tinhThetichhtt() {
        return thetich = PI * bankinh * bankinh * chieucao;
    }

    public void thongtinhtt()
    {
        System.out.println(" Chieu cao = " +chieucao);
        System.out.println(" Chu vi = " +tinhChuvihtt());
        System.out.println(" Dien tich = " +tinhDientichhtt());
        System.out.println(" The tich = " +tinhThetichhtt());
    }
