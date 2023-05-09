package btth2;

public class Xe {
    public double khoiLuongHang;
    public double litXangConLai;
    public double litXangTieuThu;

    public Xe(double khoiLuongHang, double litXangConLai) {
        this.khoiLuongHang = khoiLuongHang;
        this.litXangConLai = litXangConLai;
    }

    public void themHang(double khoiLuongHangThem) {
        this.khoiLuongHang += khoiLuongHangThem;
    }

    public void botHang(double khoiLuongHangBot) {
        this.khoiLuongHang -= khoiLuongHangBot;
    }

    public void doXang(double soLitXang) {
        this.litXangConLai += soLitXang;
    }

    public void chayXe(double quangDuong){};

    public boolean hetXang() {
        return this.litXangConLai <= 0;
    }

    public double xangConLai() {
        return this.litXangConLai;
    }


}
