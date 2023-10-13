   abstract  class parrent 
{
      abstract   void   disp();  
}
class child extends  parrent
{
         public void disp()
         {
              System.out.println("this is disp method");
         }
}

public class Test_AbstractClass 
{
   public static void main(String[]args)
   {
            child  obj=new child();
            obj.disp();
   }    
}
