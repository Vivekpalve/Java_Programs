package JavaAdvancePractical;
public class Blocks {
    static double result;    
    static {
        result = Math.pow(2,3);
        System.out.println("First static block, result = "+ result);
      }
    static {
        result = Math.log10(100);          
        System.out.println("Inside second static block, result = "+ result);
      }
     
    {

       System.out.println("First initializer block");  
    } 
     {
       System.out.println("Second initializer block");  
     }  
    public static void main(String args[]){
        Blocks b = new Blocks();  
    }
}
