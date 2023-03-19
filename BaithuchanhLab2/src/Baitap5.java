import java.util.Scanner;

public class Baitap5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int tong = 0;
        System.out.println("Nhap vao cac so ");
        n = sc.nextInt();

        while (tong > 100) {
            tong += n;
            System.out.println("tong cua cac chu so nhap vao la" + tong);
            break;
        }

    }
}