package Sach;

public class SachTrinhTham extends Sach{
    public float thue;

    public SachTrinhTham(long maSach, String tenSach, double donGia, int soLuong, String nxb, float thue) {
        super(maSach, tenSach, donGia, soLuong, nxb);
        this.thue = thue;
    }
    public SachTrinhTham() {
        super();
        this.thue = 0;
    }
    @Override
    public void thongtinSach() {
        super.thongtinSach();
        System.out.println("Thue: " + thue);
    }

    @Override
    public double thanhTien() {
        return super.thanhTien() + thue;
    }

    @Override
    public int getLoai() {
        return 1;
    }
}
