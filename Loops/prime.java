package Loops;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 2){
            System.out.println("n is prime");
        } else{
            boolean isPrime = true;
            // for(int i = 2; i < n-1;i++){
            //     if(n % i == 0){
            //         isPrime = false;
            //     }
            // }
            // or 
            for(int i = 2; i <= Math.sqrt(n);i++){
                if(n % i == 0){
                    isPrime = false;
                }
            }
            if(isPrime == true){
                System.out.println("n is prime");
            } else {
                System.out.println("not prime");
            }
        }
    }
}
