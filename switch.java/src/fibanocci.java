import java.util.*;
public class fibanocci {
    public static void main(String[] args) {
        int n1=0,n2=1,n3;
        System.out.print(f1 +" comment" + n2);
        for(int i=2;i<=10;i++){
            n3=n1+n2;
            System.out.print(" " + n3);
            n1=n2;
            n2=n3;

        }

    }
}
