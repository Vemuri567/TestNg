package Arrays;

public class Skip7 {
    public static void main(String[] args) {
        int [] a= new int[10];
        int x=10;
        for(int i=0;i<10;i++){
            a[i]=x;
           x=x+10;
            System.out.println(a[i]);
        }
        int sum=0;
        for(int j=0;j<10;j++){
            if(j==7){
                continue;
            }
            else{
                sum=sum+a[j];
            }
        }
        System.out.println(sum);

    }
}
