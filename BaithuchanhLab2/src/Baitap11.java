import java.util.Scanner;

public class Baitap11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhap kich thuoc cho mang");
            n = sc.nextInt();
        } while (n < 1);
        int arrA[] = new int[n];
        System.out.println("Nhap vao phan tu cua mang");
        for (int i = 0; i < arrA.length; i++) {
            System.out.printf("A[%d]=", i);
            arrA[i] = sc.nextInt();
        }

        int x;
        System.out.println("mang ban dau la :");
        for (int i = 0; i < arrA.length; i++) {
            System.out.printf("A[%d]=", i);
            System.out.println(arrA[i]);
        }
        for (int i = 0; i < arrA.length - 1; i++) {
            for (int j = i + 1; j < arrA.length; j++) {
                if (arrA[i] > arrA[j]) {
                    x = arrA[i];
                    arrA[i] = arrA[j];
                    arrA[j] = x;
                }
            }
        }
        System.out.println("mang sau khi sap xep theo thu tu tang dan la:");
        for (int i = 0; i < arrA.length; i++) {
            System.out.printf("A[%d]=", i);
            System.out.println(arrA[i]);

        }
    }
}
