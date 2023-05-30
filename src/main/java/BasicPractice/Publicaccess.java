package BasicPractice;

public class Publicaccess
{
    public void main()
    {
        String name="nikhil";
        System.out.println(name);
    }

    public static void main(String[] args) {
        Publicaccess obj=new Publicaccess();
        obj.main();
    }
}
