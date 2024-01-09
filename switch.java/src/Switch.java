import java.util.*;
public class Switch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        String employee=in.next();
        switch(num){
            case 1 :
                System.out.println("jai");
                break;
            case 2 :
                System.out.println("man");
                break;
            case 3 :
                switch(employee){
                    case "tri" :
                        System.out.println("good employee");
                        break;
                    case "karthik" :
                        System.out.println("good");
                        break;
                }
                break;
                default:
                System.out.println("enter other");
                break;
        }
    }
}