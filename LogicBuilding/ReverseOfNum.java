import java.util.*;
public class ReverseOfNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int num=sc.nextInt();
        while(num>0){
            int dig=num%10;
            num=num/10;
            System.out.print(dig);
        }
    }
}
