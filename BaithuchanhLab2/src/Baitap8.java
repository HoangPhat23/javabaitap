import java.text.DecimalFormat;
import java.util.Scanner;

public class Baitap8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int tong = 0;
        int x;
        float TBC;
        System.out.println("Nhap vao day:");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Nhap vao so thu " + i + " :");
            x = sc.nextInt();
            tong += x;
        }
        TBC = tong / n;
        System.out.println("Trung binh cong la : " + TBC);
        TBC = sc.nextFloat();
    }

}
