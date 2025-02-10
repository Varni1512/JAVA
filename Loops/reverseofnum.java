package Loops;

public class reverseofnum {
    public static void main(String[] args) {
        int num = 1512;
        int rev = 0;
        while(num > 0){
            int lastdigit = num % 10;
            rev = (rev*10) + lastdigit;
            // System.out.print(lastdigit);
            num = num/10;
        }
        System.out.print(rev);
    }
}
