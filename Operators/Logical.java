package Operators;

public class Logical {
    public static void main(String[] args) {
        //Logical Operator

        //Both true then true otherwise false
        System.out.println("logical AND : " + ((3>2) && (5>0)));
        //Both false then false otherwise true
        System.out.println("logical OR : " + ((3<2) || (5<0)));
        //If true then false
        System.out.println("logical NOT : " + (!(3<2)));
    }
}
