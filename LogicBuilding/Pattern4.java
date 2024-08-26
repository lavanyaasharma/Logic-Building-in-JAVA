
import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int st=n;
        int sp=0;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            st--;
            sp++;
            System.out.println();
        }
    }
    
}
