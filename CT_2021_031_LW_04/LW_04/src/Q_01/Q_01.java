package Q_01;

import java.util.*;

public class Q_01 {
    public static void main(String[] args) {

        Scanner s;
        s=new Scanner(System.in);

        System.out.print("input first number:");
        int a=s.nextInt();

        System.out.print("input second number:");
        int b=s.nextInt();

        System.out.print("input third number:");
        int c=s.nextInt();

        if(a<b)
        {
            if(a<c)
            {
                System.out.println("The minimum Number is "+a);
            }else{
                System.out.println("The minimum Number is "+c);
            }
        }else
        {
            if(b<c)
            {
                System.out.println("the minimum Number is "+b);
            }else
            {
                System.out.println("the minimum Number is "+c);
            }
        }

    }
}
