package Class;

import java.util.Scanner;

public class Thu{
    public static void main(String[] args) {
        int d1 = 1, m1 = 1, y1 = 1970;
        int d, m, y;
        System.out.println("Nhap ngay, thang, nam: ");
        Scanner in = new Scanner(System.in);
        d = in.nextInt();
        m = in.nextInt();
        y = in.nextInt();
        int tong = 0;
        for (int i = 1; i < m; i++) {
            if (i == 2) {
                tong += 28;
            } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                tong += 30;
            } else {
                tong += 31;
            }
        }
        tong += d;
        if (m > 2 && (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)) {
            tong++;
        }

        switch (tong % 7) {
            case 0:
                System.out.println("Chủ Nhật");
                break;
            case 1:
                System.out.println("Thứ hai");
                break;
            case 2:
                System.out.println("Thứ ba");
                break;
            case 3:
                System.out.println("Thứ tư");
                break;
            case 4:
                System.out.println("Thứ năm");
                break;
            case 5:
                System.out.println("Thứ sáu");
                break;
            case 6:
                System.out.println("Thứ bảy");
                break;
        }
    }
}