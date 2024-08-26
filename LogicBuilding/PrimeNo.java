import java.util.*;
public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t  = sc.nextInt();
        for (int  i= 0;  i<t; i++){
            int num=sc.nextInt();
            int count=0;
            for(int div=1;div<=num;div++){
                if(num%div==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(num + " is a prime no");
            }
            else{
                System.out.println(num + " is not a prime number");
            }
        }
        System.out.println("DONE.");
            
        }
    }

