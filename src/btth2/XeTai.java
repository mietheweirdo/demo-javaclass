package btth2;

public class XeTai extends Xe {

    public XeTai(double khoiLuongHang, double litXangConLai) {
        super(khoiLuongHang, litXangConLai);
    }

    @Override
    public void chayXe(double quangDuong) {
        this.litXangConLai -= quangDuong * 20/100 +  this.khoiLuongHang * 1/100;

    }

}