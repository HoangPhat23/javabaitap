import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap vao so n");
        n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("So vua nhap la so chan");
        } else
            System.out.println("So vua nhap la so le");

    }

}
