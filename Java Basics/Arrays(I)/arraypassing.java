public class arraypassing {
  public static void update(int mark[]){
    for(int i=0; i<mark.length;i++){
      mark[i] = mark[i] + 1;
    }
  }
  public static void main(String[] args) {
    int mark[] = {95,98,97};
    update(mark);

    //print our marks
    for(int i=0; i<mark.length;i++){
      System.out.print(mark[i]+" ");
    }
    System.out.println();
  }
}
