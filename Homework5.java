public class Homework5
{
   // Variable to count amount of times program runs. 
   static int count = 0;
   public static void main(String[] args)
   {
      // Calling Fibonacci funcition for value ten. 
       System.out.println(Fibonacci(10));
      // Prints amount of time program runs. 
       System.out.println(count);
   }
   public static int Fibonacci(int x)
   { 
      // Increases ever time recursive function runs again. 
       count++;
       if(x <2)
       {
          // This base case only occurs once Fibonacci sequence is broken down to values of less than 2. 
          // It returns that value when less than 2 because Fibonacci values of 0 and 1 are just equal to themselves. 
           return x;
       }
       else
       {
          // For values more than 1, we break down the input into the function of itself minus one, plus itself minues two.
          // These are continually rerun until the function completely breaks them down into Fibonacci values of one or 0.
          // The function then retroactively adds all the values back to return the complete sum. 
           return Fibonacci(x-1) + Fibonacci(x-2);
       }
   }
}
