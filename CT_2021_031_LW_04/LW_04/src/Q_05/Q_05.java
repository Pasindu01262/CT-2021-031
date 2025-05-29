package Q_05;

import java.util.*;

public class Q_05 {
    public static void main(String[] args) {

        Scanner s;
        s=new Scanner(System.in);

        System.out.println("Welcome to MyJava Lo-Fat Burgers!\n");

        System.out.println("Choose an Entree:");
        System.out.println("1. Tofu Burger - $3.49");
        System.out.println("2. Cajun Chicken - $4.59");
        System.out.println("3. Buffalo Wings - $3.99");
        System.out.println("4. Rainbow Fillet - $2.99");
        System.out.print("enter your choice (1-4):");

        int a=s.nextInt();

        System.out.println("\n\n");

        System.out.println("Choose a Side Dish:");
        System.out.println("1. Rice Cracker - $0.79");
        System.out.println("2. No-Salt Fries - $0.69");
        System.out.println("3. Zucchini - $1.09");
        System.out.println("4. Brown Rice - $0.59");
        System.out.print("Enter your choice (1-4):");

        int b=s.nextInt();

        System.out.println("\n\n");

        System.out.println("Choose a Drink:");
        System.out.println("1. Cafe Mocha - $1.99");
        System.out.println("2. Cafe Latte - $1.90");
        System.out.println("3. Espresso - $2.49");
        System.out.println("4. Oolong Tea - $0.99");
        System.out.print("Enter your choice (1-4):");

        int c=s.nextInt();

        System.out.println("\n\n");

        System.out.println("your order summary:");


        switch(a)
        {
            case 1:
                System.out.println("Tofu Burger - $3.49");
                break;

            case 2:
                System.out.println("Cajun Chicken - $4.59");
                break;

            case 3:
                System.out.println("Buffalo Wings - $3.99");
                break;

            case 4:
                System.out.println("Rainbow Fillet - $2.99");
                break;

            default:
                System.out.println("enter valid number");
                break;
        }




        switch(b)
        {
            case 1:
                System.out.println("Rice Cracker - $0.79");
                break;

            case 2:
                System.out.println("No-Salt Fries - $0.69");
                break;

            case 3:
                System.out.println("Zucchini - $1.09");
                break;

            case 4:
                System.out.println("Brown Rice - $0.59");
                break;

            default:
                System.out.println("enter valid number");
                break;
        }




        switch(c)
        {
            case 1:
                System.out.println("Cafe Mocha - $1.99");
                break;

            case 2:
                System.out.println("Cafe Latte - $1.90");
                break;

            case 3:
                System.out.println("Espresso - $2.49");
                break;

            case 4:
                System.out.println("Oolong Tea - $0.99");
                break;

            default:
                System.out.println("enter valid number");
                break;
        }

           double bill=0;

        switch(a)
        {
            case 1:
                bill=3.49;
                break;

            case 2:
                bill=4.59;
                break;

            case 3:
                bill=3.99;
                break;

            case 4:
                bill=2.99;
                break;

            default:
                bill=0;
                break;
        }


        switch(b)
        {
            case 1:
                bill=bill+0.79;
                break;

            case 2:
                bill=bill+0.69;
                break;

            case 3:
                bill=bill+1.09;
                break;

            case 4:
                bill=bill+0.59;
                break;

            default:
                bill=bill+0;
                break;
        }


        switch(c)
        {
            case 1:
                bill=bill+1.99;
                System.out.println("Total: "+bill);
                break;

            case 2:
                bill=bill+1.90;
                System.out.println("Total: "+bill);
                break;

            case 3:
                bill=bill+2.49;
                System.out.println("Total: "+bill);
                break;

            case 4:
                bill=bill+0.99;
                System.out.println("Total: "+bill);
                break;

            default:
                bill=bill+0;
                System.out.println("Total: "+bill);
                break;
        }








    }
}
