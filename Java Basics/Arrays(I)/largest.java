public class largest {
  public static int large(int num[]){
    int larges = Integer.MIN_VALUE; //-infinity
    int smallest = Integer.MAX_VALUE;
    for(int i=0;i<num.length;i++){
      if(num[i]>larges){
        larges = num[i];
      }
      if(smallest > num[i]){
        smallest = num[i];
      }
    }
    System.out.println("Smallest value = " + smallest);
    return larges;
  }
  public static void main(String[] args) {
    int num[] = {2,4,8,15,25,12};
    System.out.println("largest Value = " + large(num));
  }
}
