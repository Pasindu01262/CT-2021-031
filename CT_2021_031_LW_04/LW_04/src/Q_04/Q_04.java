package Q_04;

import java.util.*;

public class Q_04 {
    public static void main(String[] args) {

        Scanner s;
        s=new Scanner(System.in);

        System.out.print("input year:");

        int year=s.nextInt();

        if((year/4==0)&&(year/100==0))
        {
            if(year/400==0)
            {
                System.out.println("Leap year");
            }else
               {
                System.out.println("Not a Leap Year");
               }
        }else
        {
            if(year/4==0)
            {
                System.out.println("Leap Year");
            }else
            {
                System.out.println("Not a Leap year");
            }
        }
    }
}
