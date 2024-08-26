public class Pattern13 {
    public static void main(String[] args) {
        int rows=7;
        for(int i=1;i<=rows;i++){
            int num=1;
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num=num*(i-j)/j;
            }
            System.out.println();
        }
    }
}
