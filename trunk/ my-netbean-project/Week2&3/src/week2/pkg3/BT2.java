package week2.pkg3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class BT2 {
    
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<Integer>();
        System.out.print("Nhap so luong phan tu cua A: ");
        int n = input();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            s.add(input());
        }
        countSubSets(s);
    }
    
    private static int input() {
        int n = 0;
        Scanner num = new Scanner(System.in);
        n = num.nextInt();
        return n;
    }
    
    private static void countSubSets(List<Integer> s) {
        int setSize = s.size();
        int finalValue = (int) (Math.pow(2, setSize));
        String bValue = "";
        System.out.println("Cac tap con cua A: ");
        for (int i = 0; i < finalValue; i++) {
            bValue = Integer.toBinaryString(i);
            int bValueSize = bValue.length();
            for (int k = 0; k < (setSize - bValueSize); k++) {
                bValue = "0" + bValue;
            }
            System.out.print("{ ");
            for (int j = 0; j < setSize; j++) {
                if (bValue.charAt(j) == '1') {
                    System.out.print((s.get(j)) + " ");
                }
            }
            System.out.println("}");
        }
    }
}
