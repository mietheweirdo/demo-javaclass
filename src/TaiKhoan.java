public class TaiKhoan {
    public long soTK;
    public String tenTK;
    public double soTien;

    public TaiKhoan(long soTK, String tenTK, double soTien) {
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.soTien = soTien;
    }
    public TaiKhoan() {
        soTK = 0;
        tenTK = "";
        soTien = 0;
    }
    public void inTaiKhoan() {
        System.out.println("So tai khoan: " + soTK +
                "\nTen tai khoan: " + tenTK + '\n' +
                "SoTien=" + soTien);
        return;
    }
    public boolean napTien(double st) {
        soTien += st;
        return true;
    }

    public boolean chuyenKhoan(TaiKhoan a, double st) {
        if (a.soTien < st) {
            System.out.println("Tai khoan khong con du tien.");
            return false;
        }
        else {
            soTien += st;
            a.soTien -= st;
            System.out.println("Da chuyen khoan thanh cong.");
            return true;
        }
    }

    public static void main(String[] args) {
        TaiKhoan t = new TaiKhoan(01, "A", 0);
        TaiKhoan c = new TaiKhoan(02, "B", 10000);
        t.napTien(5000);
        t.inTaiKhoan();
        t.chuyenKhoan(c,11000);
        t.chuyenKhoan(c, 5000);
        t.inTaiKhoan();

    }
}