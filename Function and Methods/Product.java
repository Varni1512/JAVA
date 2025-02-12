package FunctionandMethods;

public class Product {
    public static int productofnum(int a,int b){
        int Product = (a*b);
        return Product;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int multi = productofnum(a, b);
        System.out.println(multi);
    }
}
