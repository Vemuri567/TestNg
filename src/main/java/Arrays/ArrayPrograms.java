package Arrays;

public class ArrayPrograms {
    /*//Array declaration
    DataType[] variablename=new DataType[size];
    Datatype[] variablename={value1,value2,value3,value4}*/
    //i want to sum all values in the array
    /* ifi want to retrieve values from the array
    arrayvariable[index];
    if you want to assign that value into any variable
    arrayvariablenamedatatype variablename=arrayvariablename[index];*/
    static int[] a={1,2,3,4,5,6,7,8,9,10};//index starts with 0
    public static void main(String[] args) {
        /*int b=a[0];
        System.out.println(b);
        //find the size of the array =arrayvariblename.length
        int size=a.length;//10
        //iteration in array
        for(int i=0;i<=size-1;i++)
        {
            System.out.println(a[i]);
        }*/

        //set values in the array

        int[] c= new int[5];
        /*i want to save 1,2,3,4,5 values into c array
         arrayvariablname[index]=value;
        * */
        c[0]=1;
        c[1]=2;
        c[2]=3;
        c[3]=4;
        c[c.length-1]=5;

        int size1=c.length;
        //retrieving values from the array
        for(int i=0;i<=size1-1;i++)
        {
            System.out.println(c[i]);
        }



    }
}
