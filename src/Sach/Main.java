package Sach;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void SapXep(ArrayList<Sach> a) {
//        for (int i = 0; i < a.size() - 1; i++) {
//            for (int j = 1; j < a.size(); j++) {
//                if (a.get(j - 1).donGia > a.get(i).donGia) {
//                    Sach temp = a.get(j - 1);
//                    a.set(j - 1, a.get(i));
//                    a.set(i, temp);
//                }
//            }
//        }
        a.sort(new Comparator<Sach>() {
            @Override
            public int compare(Sach s1, Sach s2) {
                if (s1.donGia > s2.donGia) {
                    return 1;
                } else if (s1.donGia < s2.donGia) {
                    return -1;
                }
                return 0;
            }
        });
        return;
    }

    public static void TimKiem(ArrayList<Sach> a, String ten) {

        for (Sach i : a) {
            if (i.tenSach.equalsIgnoreCase(ten)) {
                i.thongtinSach();
                return;
            }
        }
        System.out.println("Khong tim thay sach");

    }
    public static void TongTienTungLoai(ArrayList<Sach> a) {
        double tthuyet = 0, ttham = 0;
        for (Sach i: a) {
            if (i.getLoai() == 0) tthuyet += i.donGia;
            else ttham += i.donGia;
        }
        System.out.println("Tong tien cua sach tieu thuyet: " + tthuyet);
        System.out.println("Tong tien cua sach trinh tham: " + ttham);
    }

    public static void main(String[] args) {
        ArrayList<Sach> s = new ArrayList<Sach>();
        s.add(new SachTieuThuyet(1, "Tieu thuyet 1", 10.0, 5, "NXB A", true));
        s.add(new SachTrinhTham(2, "Trinh tham 1", 15.0, 3, "NXB B", 2.5f));
        s.add(new SachTieuThuyet(3, "Tieu thuyet 2", 12.0, 7, "NXB C", false));
        s.add(new SachTrinhTham(4, "Trinh tham 2", 20.0, 2, "NXB D", 1.0f));
        s.add(new SachTieuThuyet(5, "Tieu thuyet 3", 11.0, 4, "NXB E", true));
        s.add(new SachTieuThuyet(6, "Tieu thuyet 4", 14.0, 6, "NXB F", false));
        s.add(new SachTrinhTham(7, "Trinh tham 3", 18.0, 3, "NXB G", 3.0f));
        s.add(new SachTrinhTham(8, "Trinh tham 4", 22.0, 5, "NXB H", 2.0f));
        s.add(new SachTrinhTham(9, "Trinh tham 5", 25.0, 2, "NXB I", 1.5f));
        SapXep(s);
        for (Sach i : s) {
            i.thongtinSach();
        }
//        TimKiem(s, "tieu thuyet 4");
//        TongTienTungLoai(s);
    }
}

