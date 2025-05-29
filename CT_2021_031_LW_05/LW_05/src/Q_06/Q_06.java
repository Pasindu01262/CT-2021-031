package Q_06;

import java.util.*;

public class Q_06 {
    public static void main(String[] args) {

        int x=(int)(Math.random()*100);

        if(x<=50)
        {
            System.out.println("Lower");
        }else
        {
            System.out.println("higher");
        }

        Scanner s;
        s=new Scanner(System.in);
        System.out.print("input a number:");
        int Number;
        Number=s.nextInt();

        System.out.println("random Number is: "+x);


    }
}
