package Sach;

public class Sach {
    public long maSach;
    public String tenSach;
    public double donGia;
    public int soLuong;
    public String nxb;

    public Sach(long maSach, String tenSach, double donGia, int soLuong, String nxb) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nxb = nxb;
    }
    public Sach() {
        maSach = 0;
        tenSach = "";
        donGia = 0;
        soLuong = 0;
        nxb = "";
    }
    public void thongtinSach() {
        System.out.println("Ma sach: " + maSach +
                "\nTen sach: " + tenSach +
                "\nDon gia: " + donGia +
                "\nSo luong: " + soLuong +
                "\nNXB: " + nxb);
        return;
    };
    public double thanhTien() {
        return soLuong * donGia;
    };
    public int getLoai(){
        return 2;
    };
}
