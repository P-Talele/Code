public class Test_Para_Cons
{    
           int a=200;
           int b=300;
       public Test_Para_Cons(int a, int b)
       {
           System.out.println(a+b+"=adition of two variable");
       }

          public Test_Para_Cons()
       {
           System.out.println(a+b+"=adition of two variable");
       }


         
      public static void main(String[]args)
      {
           int a=20;
           int b=30;
           Test_Para_Cons obj=new Test_Para_Cons(a,b);
            Test_Para_Cons obj1=new Test_Para_Cons();
      }
}
