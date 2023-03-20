import java.util.Scanner;

public class Baitap12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so dong");
        int soCot = sc.nextInt();
        System.out.println("Nhap vao so cot");
        int soDong = sc.nextInt();
        int arrA[][] = new int[soDong][soCot];
        System.out.println("Nhap vao phan tu");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.printf("A[%d][%d] =", i, j);
                arrA[i][j] = sc.nextInt();
            }
        }
        int max = arrA[0][0];
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                if (max < arrA[i][j]) {
                    max = arrA[i][j];
                }

            }
        }
        System.out.println("Phan tu co gia tri lon nhat trong mang la " + max);

    }
}
