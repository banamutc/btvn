import java.util.Scanner;

public class BT1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n:");
        int n = scanner.nextInt();
        //scanner.close();

        while (n ==0){
            System.out.println("Khong hop le");
            System.out.println("Moi nhap lai:");
            n = scanner.nextInt();
        }
        if(n>0) {
            System.out.println(n +" la so duong");
        }
        if(n<0) {
            System.out.println(n +" la so am");
        }
    }


}
