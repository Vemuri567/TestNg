package LoopStatements;

public class Starpyramidpattern {
    public static void main(String[] args) {
        /*program to print below format
            *
            * *
            * * *
            * * * *
            * * * * *
         * */

        for(int i=1;i<=5;i++)//rows iteration
        {
            for(int j=1;j<=i;j++)//columns iteration
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        /*
        program to print below pattern
        *****
        ****
        ***
        **
        *
        */
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
     /*
        **
        ****
        ******
        ********
* */


    }
}
