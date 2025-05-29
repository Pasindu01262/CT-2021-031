package Q_04;

import java.util.*;

public class Q_04 {
    public static void main(String[] args) {

        Scanner s;
        s=new Scanner(System.in);

        System.out.print("enter Number:");
        int N;
        N=s.nextInt();

        for(int x=1; (x<=N); x=x+1)
        {
            for(int j=1; (j<=x); j=j+1)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }


    }
}
