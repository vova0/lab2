import java.util.Scanner;
public class primer2 {
    public static int da(int d) {
        if (d==1) {
            System.out.println("1");
            return 1;
            }
            else {
            if (d%2==0) {
                System.out.println("0");
                return da(d/2);
            }
            else {
                System.out.println("1");
                return da((d-1)/2);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in,"cp1251");
        System.out.println("введите число");
        int a=sc.nextInt();
        System.out.println("число в двоичном системе счисления");
        da(a);
    }
}
