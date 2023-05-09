package btth2;

public class XeMay extends Xe {

    public XeMay(double khoiLuongHang, double litXangConLai) {
        super(khoiLuongHang, litXangConLai);

    }

    @Override
    public void chayXe(double quangDuong) {
        this.litXangConLai -= quangDuong * 2/100 + this.khoiLuongHang * 0.1/10;

    }

}
