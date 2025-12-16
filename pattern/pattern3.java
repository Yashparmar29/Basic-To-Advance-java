import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();
        int i,j;

        for(i=1;i<=no1;i++)
        {
            for(j=1;j<no2;j++)
            {
                if(i== 1 || j==1 || i==no1 || j==no2)
                {
                    System.out.print("*");    
                }
                else
                {
                System.out.print(" ");
                }
            }
            System.out.println("*");
        }
    }
}
