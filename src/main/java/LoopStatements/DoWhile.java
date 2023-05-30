package LoopStatements;

public class DoWhile {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        do{
            sum=sum+i;
            i++;
        }while(i<1);
        System.out.println("Do while loop  output:"+sum);

        i=1;
        sum=0;
        while(i<1)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("while loop  output:"+sum);
    }
}
