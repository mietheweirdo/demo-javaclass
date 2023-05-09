package Class;
import java.util.Scanner;

public class PTBac1 {
    public static void main(String[] args) {
        double a, b;
        System.out.println("Nhap he so a, b: ");
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        if (a == 0) {
            if (b == 0)
                System.out.println("Phuong trinh co vo so nghiem.");
            if (b != 0)
                System.out.println("Phuong trinh vo nghiem.");

        }
        else {
            if (b == 0) System.out.println("Phuong trinh co nghiem x = 0.");
            else System.out.println("Phuong trinh co nghiem x = " + (-b/a));
        }
    }
}
