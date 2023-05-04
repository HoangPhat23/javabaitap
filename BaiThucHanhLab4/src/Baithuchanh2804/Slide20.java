import java.util.ArrayList;

public class Slide20 extends Slide17 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Ha");
        arr.add("Manh");
        arr.add("Kien");
        arr.add(0, "Ten:");
        arr.remove(0);
        arr.set(1, "Trung");
        HienThi(arr);
        System.out.println("So luong phan tu la:" + arr.size());
    }
}