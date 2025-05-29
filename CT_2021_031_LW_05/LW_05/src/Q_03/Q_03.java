package Q_03;

import java.util.*;

public class Q_03 {
    public static void main(String[] args) {

        Scanner s;
        s=new Scanner(System.in);

        System.out.print("enter Number: ");
        int N;
        N=s.nextInt();

        int multiplication;

        for(int x=1; (x<=10); x=x+1)
        {
            multiplication=N*x;
            System.out.println(multiplication);

        }


    }
}
