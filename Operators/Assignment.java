package Operators;

public class Assignment {
    public static void main(String[] args) {
        int a = 10;
        //Assignment Operator
        System.out.println("= : " + (a=5));
        System.out.println("+= : " + (a+=10));
        System.out.println("-= : " + (a-=10));
        System.out.println("*= : " + (a*=10));
        System.out.println("/= : " + (a/=10));
        System.out.println("%= : " + (a%=10));
    }
}
