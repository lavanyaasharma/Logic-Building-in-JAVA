import java.util.Scanner;

public class RotateNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int num=sc.nextInt();
        System.out.print("enter the number of rotation: ");
        int k=sc.nextInt();
        int nod=0;
        int temp=num;
        while(temp>0){
            temp=temp/10;
            nod++;
        }
        k=k%nod;
        if(k<0){
            k=k+nod;
        }
        int div=1;
        int mul=1;
        for(int i=1;i<=nod;i++){
            if(i<=k){
                div=div*10;
            } 
            else{
                mul=mul*10;
            }
        }
        int q=num/div;
        int r=num%div;
        int rot=r*mul+q;
        System.out.println(rot);
    }
}
