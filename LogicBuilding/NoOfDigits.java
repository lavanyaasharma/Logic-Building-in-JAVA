import java.util.*;
public class NoOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int num=sc.nextInt();
        int digit=0;
        while(num!=0){
            num=num/10;
            digit++;
        }
        System.out.println("the number of digits are: " +digit);
    }
    
}
