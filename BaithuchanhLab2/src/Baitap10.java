import java.util.Scanner;

public class Baitap10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        System.out.println("Nhap vao chuoi ky tu");
        s = sc.nextLine();
        System.out.println("nhap vao ky tu");
        char a = sc.next().charAt(0);
        int dem = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == a) {
                dem++;
            }
        }
        System.out.println("So lan xuat hien ky tu " + a + " trong chuoila" + dem);
    }
}