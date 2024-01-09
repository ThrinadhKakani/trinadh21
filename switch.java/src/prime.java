import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int num = in.nextInt();
        int count = 0;
        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0)
                    count++;
        }
        if (count == 2) {
            System.out.println("prime number");
        } else {
            System.out.println("not a prime number");
        }}else{
            System.out.println("enter a valid number");
        }
}}
