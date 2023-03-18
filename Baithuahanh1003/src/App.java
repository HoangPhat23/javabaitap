import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Ktm");
            n = sc.nextInt();
        } while (n < 1);
        int arrA[] = new int[n];
        System.out.println("Nhap vao phan tu cua mang");
        for (int i = 0; i < arrA.length; i++) {
            System.out.printf("A[%d]=", i);
            arrA[i] = sc.nextInt();
        }

        int temp;
        System.out.println("mang ban dau la :");
        for (int i = 0; i < arrA.length; i++) {
            System.out.printf("A[%d]=", i);
            System.out.println(arrA[i]);

        }
        for (int i = 0; i < arrA.length - 1; i++) {
            for (int j = i + 1; j < arrA.length; j++) {
                if (arrA[i] > arrA[j]) {
                    temp = arrA[i];
                    arrA[i] = arrA[j];
                    arrA[j] = temp;

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
