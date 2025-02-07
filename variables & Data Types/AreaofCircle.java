import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter R : ");
        int a = sc.nextInt();
        int Area = a * a;
        System.out.println("Area of circle : "+Area);
    }
}
