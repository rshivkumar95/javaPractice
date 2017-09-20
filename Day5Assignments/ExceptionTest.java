public class ExceptionTest {
       public static void main(String[] args)
       {
    	   try{
    		   if(args[0]!=null && args[1]!= null)
    		   {   int num1 = Integer.parseInt(args[0]);
    	  
          int num2 = Integer.parseInt(args[1]);  
          
    	   System.out.println(" Division is "+num1/num2);
    	   
    		   }
    	   }
    	   catch(ArrayIndexOutOfBoundsException e){
    		   System.out.println("no arguments");
    	   }
    	   catch(NumberFormatException e){
    		  System.out.println("Only Integers are Allowed");
       	   }
    	   catch(ArithmeticException e){
    		   System.out.println("Division by zero");
    	   }
       
       }
}

/*

F:\>javac ExceptionTest.java

F:\>java ExceptionTest 12 4
 Division is 3

F:\>java ExceptionTest
no arguments

F:\>java ExceptionTest sd khkh
Only Integers are Allowed

F:\>java ExceptionTest 12 0
Division by zero

F:\>

*/
