public class Calculator {
  public static void main(String[] args) {
    int num1 = 10;
    int num2 = 2;
    int choice = 1;
    switch (choice) {
      case 1:
        System.out.println("Sum is : " + (num1 + num2));
        break;
      case 2:
        System.out.println("Sub is : " + (num1 - num2));
        break;
      case 3:
        System.out.println("Mul is : " + (num1 * num2));
        break;
      case 4:
        System.out.println("div is : " + (num1 / num2));
        break;
      default:
        System.out.println("Please enter correct no");
        break;
    }
  }
}
