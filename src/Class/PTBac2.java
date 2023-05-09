package Class;

import java.util.Scanner;

public class PTBac2 {
    public static void main (String[] args) {
        double a, b, c;
        System.out.println("Nhap 3 he so a, b, c: ");
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        if (a==0){
            System.out.println("Phuong trinh co 1 nghiem: " + -c/b);
        }
        else {
            double delta = b * b - 4 * a * c;
            if (delta < 0)
                System.out.println("Phuong trinh vo nghiem.");
            else if (delta == 0)
                System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + (-b / (2*a)));
            else
                System.out.println("Phuong trinh co 2 nghiem phan biet: \n x1 = " + ((-b - Math.sqrt(delta))/(2 * a))
                + "\n x2 = " + ((-b + Math.sqrt(delta))/(2 * a)));
        }
    }
}