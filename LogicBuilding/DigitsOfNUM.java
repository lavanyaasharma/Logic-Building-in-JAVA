import java.util.*;
public class DigitsOfNUM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int num=sc.nextInt();
        int nod=0;
        int temp=num;
        while(temp!=0){
            temp=temp/10;
            nod++;
        }
        int div=(int)Math.pow(10, nod-1);
        while(num!=0){
            int q=num/div;
            System.out.println(q);
            num=num%div;
            div=div/10;

        }
        
    }
}
