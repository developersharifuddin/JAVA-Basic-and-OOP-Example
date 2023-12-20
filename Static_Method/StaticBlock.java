
package Static_Method;

public class StaticBlock {
    // static variable
    static int id;
    static String name;
    
    // static block
    static {
        
    id = 22200;
    name = "sharif uddin";
    }
    
   static void display(){
        System.out.println("id is " +id);
        System.out.println("name is " +name);
    }
    
    public static void main(String[] args) {
        
        /*StaticBlock.display();*/
    StaticBlock.display();
    }
    
}
