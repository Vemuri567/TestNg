package LoopStatements;

public class Whileloop {
    public static void main(String[] args) {
        /** sum of first 10nos**/
        int i=0;//initial value taken as 0
        int sum=0;//consider output sum is zero in the intitial level
        while(i<=10)
        {
            sum=sum+i;//0+0=0,0+1=1,
            i++;//i=i+1;0+1=1,2
        }
        System.out.println(sum);
        /**if my sum=10,then don't add next no's**/
        i=0;
        sum=0;
        while(i<=10)
        {
            sum=sum+i;
            if(sum==10)
            {
                break;
            }
            i++;
        }
        System.out.println(sum);
        /**if my i=4,then skip that no addition**/
        i=0;
        sum=0;
        while(i<=10)
        {
            if(i==4)
            {
                i++;
                continue;
            }
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
}
