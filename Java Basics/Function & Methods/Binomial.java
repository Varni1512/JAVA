public class Binomial {
  public static int factorial(int n){
    int f = 1;
    for(int i = 1; i <= n; i++){
      f = f * i;
    }
    return f;
  }
  public static int binocoeff(int n, int r){
    int result = factorial(n) / (factorial(r) * factorial(n - r));
    return result;
  }
  public static void main(String[] args) {
    System.out.println(binocoeff(5, 2));
  }
}
