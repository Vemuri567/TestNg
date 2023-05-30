package ConditionalStatements;

public class IfPractice {
    /**check whether given no is even no or not
     * check whether given no is prime or not
     * @param args
     */
  /*if marks <35  op should be fail
        if marks>35 and <60  second class
         marks>60 and <=100 firstclass*/
  public static void main(String[] args) {
      int marks=41;
      if(marks%2==0){
          System.out.println("marks is even no");
      }
      else {
          System.out.println("marks is odd no");
      }
      if(marks<35)
      {
          System.out.println("fail");
      }
      else if((marks>35)&&(marks<=60))
      {
          System.out.println("secondclass");
      }
      else if((marks>60)&&(marks<=100))
      {
          System.out.println("firstclass");
      }

  }
}
