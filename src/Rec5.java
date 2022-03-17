public class Rec5 {
    public static int f(int n){
        if (n==0){
            System.out.println("0");
            return 0;
        }
        else {
            if (n == 1) {
                System.out.println("1");
                return 1;
            } else {
                System.out.println(n);
                return f(n - 2) + f(n - 1);
            }
        }
    }
    public static void main(String[] args){
        f(4);
    }
}
