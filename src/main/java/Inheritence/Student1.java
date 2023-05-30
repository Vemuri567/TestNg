package Inheritence;

public class Student1 {

    public void methodStudent() {
        System.out.println("The method of the class Student invoked.");
    }
}
    class Science extends Student1
    {
        public void methodScience()
        {
            System.out.println("The method of the class Science invoked.");
        }
    }
    class Commerce extends Student1
    {
        public void methodCommerce()
        {
            System.out.println("The method of the class Commerce invoked.");
        }
    }
    class Arts extends Student1
    {
        public void methodArts()
        {
            System.out.println("The method of the class Arts invoked.");
        }
    }


