package LoopStatements;

public class ForLoop {
    public static void main(String[] args) {
        //forloop syntax  for(datatype variable=initialvalue;condition;increment/decrement)
        //** sum of 10 no's using for loop**/

        //** i want to sum every time first 10 no's untill no 10
        int sum=0;
       for(int i=1;i<=10;i++)
       {
           sum=sum+i;
       }
        System.out.println(sum);

        int sum1=0;
        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=10;j++){
                sum1=sum1+i;
            }

        }
        System.out.println(sum1);
    }
}
