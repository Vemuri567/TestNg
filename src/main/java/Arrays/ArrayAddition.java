package Arrays;

public class ArrayAddition {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        int size=a.length;
        for(int i=0;i<=size-1;i++)
        {
            sum=sum+a[i];
        }
        System.out.println(sum);
        //average
        System.out.println(sum/size);
    }
}
