
package Static_Method;

public class StaticVariable {
   // non static variable
   String name1="Sharif uddin1";
   
   // static variable
    static String name2="Sharif uddin2";
    
    public static void main(String[] args) {  
        //call non static variable
        StaticVariable ob1= new StaticVariable();
        System.out.println("non static variable is "+ob1.name1);
      
        
        //auto call static variable
        String name2 = StaticVariable.name2;
        System.out.println("static variable is " + name2);
    
    }
}
