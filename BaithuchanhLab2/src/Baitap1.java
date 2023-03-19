import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Baitap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 2 so ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int tong = a + b;
        System.out.println(a + "+" + b + "=" + tong);
        int hieu = a - b;
        System.out.println(a + "-" + b + "=" + hieu);
        int tich = a * b;
        System.out.println(a + "*" + b + "=" + tich);
        int thuong = a / b;
        System.out.println(a + "/" + b + "=" + thuong);
        int soDu = a % b;
        System.out.println(a + "%" + b + "=" + soDu);
        int Min = a;
        int Max = b;
        if (a > b)
            Min = b;
        Max = b;
        System.out.println("So nho nhat trong hai so" + a + " va" + b + " la" + Min);

        System.out.println("So lon nhat trong hai so" + a + " va" + b + " la" + Max);
        if (a == b) {
            System.out.println("a = b");
        } else {
            System.out.println("a < b");
        }
    }
}