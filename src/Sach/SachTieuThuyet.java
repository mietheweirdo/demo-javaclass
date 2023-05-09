package Sach;

public class SachTieuThuyet extends Sach{
    public boolean tinhTrang;

    public SachTieuThuyet(long maSach, String tenSach, double donGia, int soLuong, String nxb, boolean tinhTrang) {
        super(maSach, tenSach, donGia, soLuong, nxb);
        this.tinhTrang = tinhTrang;
    }
    public SachTieuThuyet() {
        super();
        this.tinhTrang = false;
    }
    @Override
    public void thongtinSach() {
        super.thongtinSach();
        if (!(tinhTrang)) {
            System.out.println("Tinh trang: Cu");
        } else System.out.println("Tinh trang: Moi");
    }

    @Override
    public double thanhTien() {
        if (tinhTrang)
            return super.thanhTien();
        else
            return super.thanhTien() * 0.2;
    }

    @Override
    public int getLoai() {
        return 0;
    }

}
