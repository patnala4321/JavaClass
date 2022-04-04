package ExceptionHandling;



import java.io.*;  

class M{  
 void method()throws IOException{  
  System.out.println("device operation performed");  
 }  
}  
public class ThrowsExample{  
   public static void main(String args[]){//declare exception  
     M m=new M(); 
     try
     {
     m.method();  
     }
     catch(Exception e)
     {
    	 
     }
    System.out.println("normal flow...");  
  }  
}  