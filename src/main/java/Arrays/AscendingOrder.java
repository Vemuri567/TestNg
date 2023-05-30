package Arrays;

public class AscendingOrder {
    public static void main(String[] args)
    {
        int[] a={3,2,1,5,6,4,10,9,3,2,1};
        int temp;
        for(int i=0;i<=a.length-1;i++)
        {
            for(int j=i+1;j<=a.length-1;j++)
            {
                if(a[j]<a[i])
                {
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        for(int k=a.length-1;k>=0;k--)
        {
            System.out.println("index of "+k+" "+"value is "+a[k]);
        }
    }
}
