import javax.sound.sampled.SourceDataLine;

import java.util.Scanner;
public class function {
    public static void main(String[] args) {
        sum();
        sum();
    }
    static void sum(){
    Scanner in = new Scanner(System.in);
    System.out.println("enter num");
    int num=in.nextInt();
    System.out.println("enter num2");
    int num2=in.nextInt();
    int sum=(num+num2);
    System.out.println(sum);
    
}
}

    

