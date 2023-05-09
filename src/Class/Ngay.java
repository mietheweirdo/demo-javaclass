package Class;

import java.util.Scanner;

public class Ngay {
    public static void main(String[] args) {
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

        System.out.println("Tổng số ngày từ đầu năm là: " + tong);
    }
}