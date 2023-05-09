package Class;

import java.util.Scanner;
public class HCN {
    public static void main (String[] args) {
        double a, b;
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap chieu dai, chieu rong hinh chu nhat: ");
        a = in.nextDouble();
        b = in.nextDouble();
        System.out.println("Dien tich: " + a * b);
        System.out.println("Chu vi: " + ((a + b) * 2));
    }
}
