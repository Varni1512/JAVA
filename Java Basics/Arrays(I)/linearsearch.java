public class linearsearch {
  public static int linear_search(int num[], int key){
    for(int i=0; i<num.length;i++){
      if(num[i]==key){
        return i;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int num[] = {2,4,6,8,10,12,14,16};
    int key = 12;
    int index = linear_search(num, key);
    if (index == -1) {
      System.out.println("Key not found");
    } else {
      System.out.println("Key found at index " + index);
    }
    
  }
}
