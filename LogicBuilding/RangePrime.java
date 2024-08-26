import java.util.*;
public class RangePrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lower range:");
        int low=sc.nextInt();
        System.out.println("Enter the higher range:");
        int high=sc.nextInt();
        for (int  i= low;i<=high; i++){
            int count=0;
            for(int div=1;div<=i;div++){
                if(i%div==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i + " is a prime no");
            }
        }
    
    }
}
