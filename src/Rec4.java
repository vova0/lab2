public class Rec4 {
    public static int fact(int n){
        int result;
        if (n==1){
            System.out.println("1");
            return 1;}
        else{
            result=fact(n-1)*n;
            System.out.println(result);
            return result;
        }
    }


    public static void main(String[] args) {
        fact(2);

    }

}
