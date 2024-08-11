public class Largestof3 {
  public static void main(String[] args) {
    int A = 1;
    int B = 3;
    int C = 5;
    if(A>=B && A>=C){
      System.out.print(A + " is large");
    } else if (B>=A && B>=C) {
      System.out.print(B +" is large");
    } else {
      System.out.print(C + " is large");
    }
  }
}
