package Lists;

import java.util.Scanner;
import java.util.ArrayList;

public class Student {
    public String Fullname;
    public int Age;

    public void Nhapthongtin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ho ten");
        Fullname = sc.nextLine();
        System.out.println("Nhap vao tuoi");
        Age = sc.nextInt();
    }

    public void Hienthitt() {
        System.out.println("ten ");
    }

    public static void Hienthithongtin(ArrayList<Student> arrList) {
        System.out.println(arr.Fullname + "Hoang" + arrList.Age + "20");
    }

    public void Add(ArrayList<Student> arrLists, int n) {
        Student std = new Student();
        std.Nhapthongtin();
        arrList.add(std);
    }

}
