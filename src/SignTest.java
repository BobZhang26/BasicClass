public class SignTest {
    public static void main(String[] args){
        int s = sign(-7);
        System.out.println(s);
    }

    public static int sign(int n){
        if (n < 0){
            return -1;
        }
        if (n > 0){
            return 1;
        }
        if (n == 0){
            return 0;
        }
        return sign(n-1) + sign(n-2);
    }
}
