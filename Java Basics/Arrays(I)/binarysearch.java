public class binarysearch {
  public static int binary_search(int number[], int key){
    int start = 0, end = number.length-1;

    while (start <= end) {
      int mid = (start + end) / 2;
      //comparisons
      if (number[mid] == key) {//found
        return mid;
      }
      if(number[mid] < key){//right
        start = mid + 1;
      } else {//left
        end = mid - 1;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int number[] = {2,4,6,8,10,12,14};
    int key = 25;
    System.out.println("key find at " + binary_search(number, key));
  }
  
}