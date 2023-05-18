package Baithuchanh1202;

import java.util.HashMap;
import java.util.TreeMap;

public class Map {
    public static void main(String[] args) {
        HashMap<Integer, Float> hashMap1 = new HashMap<>();
        HashMap<String, String> hashMap2 = new HashMap<>(10);
        HashMap<String, String> hashMap3 = new HashMap<>(4, 0.75f);
        HashMap<String, String> hashMap4 = new HashMap<>(new TreeMap<>());
    }

}
