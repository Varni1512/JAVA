package Conditional;

public class largestof3 {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int c = 3;
        if(a>b && a>c){
            System.out.println("A is large");
        } else if(b>c){
            System.out.println("B is largest");
        } else{
            System.out.println("C is largest");
        }
    }
}
