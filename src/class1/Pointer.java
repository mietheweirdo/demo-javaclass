package class1;

import java.util.Scanner;

class  Pointer {
    private double x;
    private double y;

    public Pointer(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Pointer other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "x = " + Double.toString(x) + "\ny = " + Double.toString(y);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập tọa độ của điểm 1
        System.out.print("Nhập tọa độ của điểm 1 (x, y): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        Pointer p1 = new Pointer(x1, y1);

        // Nhập tọa độ của điểm 2
        System.out.print("Nhập tọa độ của điểm 2 (x, y): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        Pointer p2 = new Pointer(x2, y2);

        // Xuất thông tin của 2 điểm
        System.out.println("Thông tin của điểm 1: " + p1);
        System.out.println("Thông tin của điểm 2: " + p2);

        // Tính và xuất khoảng cách giữa 2 điểm
        double distance = p1.distance(p2);
        System.out.println("Khoảng cách giữa 2 điểm là: " + distance);
    }
}

