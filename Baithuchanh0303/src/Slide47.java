import java.util.Scanner;

public class Slide47 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tong = 0;
        int n;
        String s = "";
        do {
            System.out.println("vui long nhap vao so nguyen: ");
            n = scan.nextInt();
            s = s + n + " ";
            tong += n;
        } while (tong <= 100);
        String v = s.trim().replace(" ", " + ");
        System.out.println("tong cac so vua nhap la: " + v + " = " + tong);

    }
}