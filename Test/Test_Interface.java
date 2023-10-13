interface parrent
   {
         void disp();
   }
     class   wife  implements   parrent
   {
            public void disp()
            {
                   System.out.println("This is Interface");
            }
 }
class Test_Interface 
 {
 public static void main(String[]args)
 {
         wife obj=new wife();
          obj.disp();
 }       
}
