package Conditional;

public class Student {
    public static void main(String[] args) {
        int marks = 67;
        String report = ((marks > 31) ? "pass" : "fail");
        System.out.println(report);
    }
}
