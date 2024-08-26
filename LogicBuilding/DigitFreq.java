
import java.util.Scanner;

public class DigitFreq {
    public static int digitFreq(int n,int d){
        int count=0;
        while(n>0){
            int dig=n%10;
            n=n/10;
            if (dig==d){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int n=sc.nextInt();
        System.out.println("enter the digit from a number to check the frequency : ");
        int d=sc.nextInt();
        int f=digitFreq(n,d);
        System.out.println("the number of times "+ d + " occurs is : "+ f);
    }
    
}
