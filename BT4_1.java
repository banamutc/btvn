import java.util.Scanner;

public class BT4_1 {
    public static void main(String[] args) {
        float ga=0 , cho=0 ;

        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap tong so con : ");
        int a = scanner.nextInt();
        while (a < 0) {
            System.out.println("nhap khong hop le");
            System.out.println(" nhap lai tong so con : ");
            a = scanner.nextInt();

        }

        System.out.println(" nhap tong so chan : ");
        int b = scanner.nextInt();
        while (b < 0 && b % 2 != 0) {
            System.out.println("nhap khong hop le");
            System.out.println(" nhap lai tong so chan : ");
            b = scanner.nextInt();
        }

//        while (ga + cho == a && ga * 2 + cho * 4 == b) {

        ga =(float) (4 * a - b) / (2);
        System.out.println("so con ga la : " + ga);
        cho =(float) (a - ga);
        System.out.println("so con cho la : " + cho);
        // System.out.printf("%f", cho);
        if (ga == 22 && cho == 14) {
            System.out.println("THOA MAN");
        } else {
            System.out.println("Ko co cap so nao thoa man");
        }
//            break;
//        }

    }


}
