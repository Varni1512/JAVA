public class calculator {
  //function Overloading using parameter
  // public static int sum(int a, int b){
  //   return a + b;
  // }
  // public static int sum(int a, int b, int c){
  //   return a + b + c;
  // }

  //function Overloading using Datatype
  public static int sum(int a, int b){
    return a + b;
  }
  public static float sum(float a, float b){
    return a + b;
  }
  public static void main(String[] args) {
    System.out.println(sum(10, 20)); 
    System.out.println(sum(5.5f, 6.5f));
  }
}
