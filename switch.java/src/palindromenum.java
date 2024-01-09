public class palindromenum {
    public static void main(String[] args) {
        int n=121;
        int r,i,sum=0;
        int temp=n;
        while(n>0) {
            r = n % 10;
            sum = sum * 10 + r;
            n = n / 10;
        }if(temp==sum){
            System.out.println("it is a plain");
        }else{
            System.out.println("its not a palin");
        }
    }
}
