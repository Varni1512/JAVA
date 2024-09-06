public class BinarytoDecimal {
  public static void binToDec(int binNum){
    int myNum = binNum;
    int decNum = 0;
    int pow = 0;

    while (binNum > 0) {
      int lastdigit = binNum % 10;
      decNum = decNum + (lastdigit * (int)Math.pow(2, pow));
      pow++;
      binNum = binNum / 10;
    }
    System.out.println("decimal of "+myNum+" = "+decNum);
  }

  public static void main(String[] args) {
    binToDec(1010);
  }
}
