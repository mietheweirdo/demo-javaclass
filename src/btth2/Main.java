package btth2;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap so lit xang cho xe tai: ");
        double xang = in.nextDouble();
        System.out.println("Nhap khoi luong hang cho xe tai: ");
        double hang = in.nextDouble();
        XeTai xeTai = new XeTai(hang, xang);
        xeTai.botHang(100); // bớt 100kg hàng xuống xe
        System.out.println("Khoi luong hang con lai: " + xeTai.khoiLuongHang);
        xeTai.doXang(10);
        System.out.println("So lit xang con lai: " + xeTai.litXangConLai);// đổ thêm 10 lít xăng vào xe
        xeTai.chayXe(100); // cho xe chạy 100km

        System.out.println("So lit xang con lai: " + xeTai.litXangConLai);
        if (xeTai.hetXang()) {
            System.out.println("Xe tải đã hết xăng");
        } else {
            System.out.println("Xe tải còn " + xeTai.xangConLai() + " lít xăng");
        }
    }
}
