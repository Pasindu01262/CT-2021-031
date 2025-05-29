package Q_03;

import java.util.*;

public class Q_03 {
    public static void main(String[] args) {

        System.out.println("input power:");

        Scanner s;
        s=new Scanner(System.in);

        int p=s.nextInt();

        int x=(10^p);

        if(x==(10^6))
        {
            System.out.println("Million");
        }else{
            if(x==(10^9))
            {
                System.out.println("Billion");
            }else{
                if(x==(10^12))
                {
                    System.out.println("Trillion");
                }else{
                    if(x==(10^15))
                    {
                        System.out.println("Quadrillion");
                    }else{
                        if(x==(10^18))
                        {
                            System.out.println("Quintillion");
                        }else{
                            if(x==(10^21))
                            {
                                System.out.println("Sextillion");
                            }else{
                                if(x==(10^30))
                                {
                                    System.out.println("Nonillion");
                                }else{
                                    if(x==(10^100))
                                    {
                                        System.out.println("Googol");
                                    }else{
                                        System.out.println("invalid");
                                    }

                                }
                            }
                        }
                    }
                }
            }
        }



    }
}
