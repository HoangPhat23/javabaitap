package Baithuchanh2804;

import java.util.ArrayList;

public class Slide17 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Ha");
        arr.add("Manh");
        arr.add("Kien");
        HienThi(arr);
    }

    public static void HienThi(ArrayList<String> arr) {
		for(String number : arr) {
			System.out.print(number+"\t");
		}
}