import java.util.Scanner;

public class Baitap9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        char kyTu;
        int InHoa = 0;
        int InThuong = 0;
        int ChuSo = 0;
        System.out.println("Nhap vao chuoi:");
        s = sc.nextLine();
        for (int i = 0; i <= s.length(); i++) {
            kyTu = s.charAt(i);
            System.out.println(kyTu);
            if (Character.isUpperCase(kyTu)) {
                InHoa++;
            }
            if (Character.isUpperCase(kyTu)) {
                InThuong++;
            }
            if (Character.isUpperCase(kyTu)) {
                ChuSo++;
            }

        }
        System.out.println("So chu cai in hoa" + InHoa);
        System.out.println("So chu cai in hoa" + InThuong);
        System.out.println("So chu cai in hoa" + ChuSo);
    }
}