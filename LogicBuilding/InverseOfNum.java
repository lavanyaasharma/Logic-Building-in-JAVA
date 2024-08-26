import java.util.*;
public class InverseOfNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        int inverse=0;
        int ogPosition=1;
        while(n != 0){
            int ogDigit=n%10;
            int invDigit=ogPosition;
            int invPosition=ogDigit;
            inverse=inverse+invDigit*(int)Math.pow(10,invPosition-1);

            n=n/10;
            ogPosition++;

        }
        System.out.println(inverse);
    }
}
