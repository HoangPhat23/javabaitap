package Baithuchanh1202;

import java.util.TreeSet;
import java.util.Set;
import java.util.Scanner;

public class TreeSetExp1 {
    public static void main(String[] args) {
        int number;
        TreeSet<Integer> treeSetInteger = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        // Them cac phan tu vao treeSetInteger
        treeSetInteger.add(0);
        treeSetInteger.add(3);
        treeSetInteger.add(1);
        treeSetInteger.add(4);
        treeSetInteger.add(2);
        treeSetInteger.add(8);

        // Hien thi cac phan tu trong treeSetInteger
        System.out.println("Cac phan tu trong treeSetInteger: ");
        System.out.println(treeSetInteger);
        System.out.println("Nhap cac phan tu can them: ");
        number = sc.nextInt();

        // Them mot phan tu moi vao treeSetInteger tu ban phim
        // neu phan tu do da ton tai thi thong bao nguoc lai thi them vao
        if (treeSetInteger.contains(number)) {
            treeSetInteger.add(number);
            System.out.println("Them thanhh cong! ");
            System.out.println("Cac phan tu trong treeSetInteger sau khi them: ");
            System.out.println(treeSetInteger);
        } else {
            System.out.println("Phan tu " + number + "da ton tai");
        }
    }
}
