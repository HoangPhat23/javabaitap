import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Hinhtron ht = new Hinhtron();
        Scanner sc = new Scanner(System.in);
        ht.Hienthichuvi();

        Hinhtrutron htt = new Hinhtrutron();
        htt.Nhapbankinhhtt();
        htt.tinhChuvihtt();
        htt.tinhDientichhtt();
        htt.thongtinhtt();

        Nhanvien nv = new Nhanvien();
        nv.hienthongtinnhanvien();
    }
};