package Q_02;

import java.util.*;
public class Q_02 {
    public static void main(String[] args) {

        System.out.println("0.Magenta");
        System.out.println("1.Cyan");
        System.out.println("2.Red");
        System.out.println("3.Blue");
        System.out.println("4.Green");
        System.out.println("Select one color from the above list:");

        Scanner s;
        s=new Scanner(System.in);

        int n=s.nextInt();

        switch(n)
        {
            case 0:
                System.out.println("You selected Magenta");
                break;

            case 1:
                System.out.println("You selected Cyan");
                break;

            case 2:
                System.out.println("You selected Red");
                break;

            case 3:
                System.out.println("You selected Blue");
                break;

            case 4:
                System.out.println("You selected Green");
                break;

            default:
                System.out.println("Invalid selection");
                break;





        }

    }
}
