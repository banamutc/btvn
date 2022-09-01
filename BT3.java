import java.util.Scanner;
import java.lang.Math;
public class BT3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số bậc 2, a = ");
        float a = scanner.nextFloat();
        System.out.print("Nhập hệ số bậc 1, b = ");
        float b = scanner.nextFloat();
        System.out.print("Nhập hằng số tự do, c = ");
        float c = scanner.nextFloat();
        BT3.giaiPTBac2(a, b, c);

    }
    public static void giaiPTBac2(float a, float b, float c) {

        if (a == 0) {
            if(b==0){
                if (c == 0) {
                    System.out.println("Phuong trinh vo so nghiem");
                }
                else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            }
            else {
                System.out.println("Phuong trinh co 1 nghiem duy nhat:" + "x = " + (-c / b));
            }
        }
        else {
            float delta = b*b-4*a*c;
            double x1,x2;
            if(delta > 0){
                x1 = ((-b + Math.sqrt(delta))/(2*a));
                x2 = ((-b - Math.sqrt(delta))/(2*a));
                System.out.println("Phuong trinh co 2 ngiem la:" + "x1=" + x1 + " va x2=" + x2);
            }
            else if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem!!!");
            }
            else if (delta == 0){
                x1 =( -b/(2*a));
                System.out.println("Phuong trinh co 1nghiem kep la: " + "x1 = x2 = " + x1);
            }
        }

    }
}
