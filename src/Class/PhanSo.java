package Class;

import java.util.Scanner;

public class PhanSo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.println("Nhap tu so: ");
        a = in.nextInt();
        do {
            System.out.println("Nhap mau so khac 0");
            b = in.nextInt();
        } while (b == 0);
        //Tim USCLN
        int uscln = 1;
        int c = a, d = b;
        c = Math.abs(a);
        d = Math.abs(b);
        if (a == 0 || b == 0)
            uscln = a + b;
        else {
            while (c != d) {
                if (c > d) c -= d;
                else d -= c;
            }
        }
        uscln = c;
        //Tối giản phân số
        a /= uscln;
        b /= uscln;
        System.out.println("Phan so vua nhap la: ");
        if (b < -1)
            System.out.println((-a) + "/" + b);
        else if (b == -1)
            System.out.println(-a);
        else if (b == 1)
            System.out.println(a);
        else System.out.println(a + "/" + b);
    }
}