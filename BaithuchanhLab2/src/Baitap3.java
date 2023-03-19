import java.util.Scanner;

public class Baitap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Ten;
        System.out.println("Ho va ten");
        Ten = sc.nextLine();
        System.out.println("Nam sinh ");
        int year = sc.nextInt();
        int tuoi;
        tuoi = 2023 - year;
        if (tuoi < 16) {

            System.out.println("Ban " + Ten + " dang o tuoi vi thanh nien");
        }
        if (tuoi >= 18) {
            System.out.println("Ban " + Ten + " da gia roi");
        } else {
            System.out.println("Ban " + Ten + " dang o tuoi truong thanh");
        }
    }
}