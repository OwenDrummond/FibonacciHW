public class Homework5
{
   static int count = 0;
   public static void main(String[] args)
   {
       System.out.println(Fibonacci(10));
       System.out.println(count);
   }
   public static int Fibonacci(int x)
   { 
       count++;
       if(x <2)
       {
           return x;
       }
       else
       {
           return Fibonacci(x-1) + Fibonacci(x-2);
       }
   }
}
