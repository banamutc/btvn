import java.util.Scanner;

public class BT2 {
    public static void main(String[] args){
        int i =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap diem trung binh:" );
        float dtb = scanner.nextFloat();


        System.out.print("Xếp loại của bạn là: ");
        while (dtb <0 || dtb >10){
            System.out.println("Khong hop le ");
            System.out.println("Nhap diem trung binh:" );
            dtb = scanner.nextFloat();
        }
        if(8 <= dtb && dtb < 10){
            System.out.println("Xep loai gioi");
        }
        else if (6.5 <= dtb && dtb <8) {
            System.out.println("Xep loai kha");
        }
        else if (5 < dtb && dtb <6.5) {
            System.out.println("Xep loai trung binh");
        }
        else if (0 <= dtb && dtb <5) {
            System.out.println("Xep loai yeu");

        }


    }
}
