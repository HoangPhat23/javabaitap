import java.util.Scanner;

public class Slide74 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhap vao so phan tu cua mang");
            n = sc.nextInt();
        } while (n < 1);

        int arrA[] = new int[n];
        System.out.println("nhap gia tri phan tu cua mang");
        for (int i = 0; i < arrA.length; i++) {
            System.out.printf("A[%d] =", i);
            arrA[i] = sc.nextInt();

        }
        int tong = 0;
        System.out.println("Tong cac so chan trong mang la:");
        for (int i = 0; i < arrA.length; i++) {
            if (arrA[i] % 2 == 0) {
                tong = tong + arrA[i];
            }

        }

        System.out.println(tong);

    }

}