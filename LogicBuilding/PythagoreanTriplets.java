import java.util.Scanner;
public class PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c){
           if(a*a==(b*b)+(c*c)){
            System.out.println("yes");
           }
           else{
            System.out.println("no");
           }
        }
        else if(b>a && b>c){
            if(b*b==(a*a)+(c*c)){
             System.out.println("yes");
            }
            else{
             System.out.println("no");
            }
         }
         else if(c>b && c>a){
            if(c*c==(b*b)+(a*a)){
             System.out.println("yes");
            }
            else{
             System.out.println("no");
            }
         }
         else{
            System.out.println("try again");
         }
    }
    
}
