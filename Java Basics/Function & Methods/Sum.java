import java.util.*;
public class Sum {

  public static int calculateSum(int a,int b){ //parameters or formal parameter
    int sum = a + b;
    return sum;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = calculateSum(a,b); // arguments or actual parameters
    System.out.println("Sum of two numbers is: " + sum);

  }

}
