import java.util.*;
public class GCDandLCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: " );
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int on1=num1;
        int on2=num2;
        while(num1%num2 != 0){
            int rem=num1%num2;
            num1=num2;
            num2=rem;
        }
        int gcd=num2;
        int lcm=(on1*on2)/gcd;
        System.out.println("GCD IS : "+ gcd);
        System.out.println("LCM IS : " + lcm);
    }
}
