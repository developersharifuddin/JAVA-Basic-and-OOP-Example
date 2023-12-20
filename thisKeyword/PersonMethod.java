
package thisKeyword;
////Person Call to consctructor method
public class PersonMethod {
    
    
    void message(){
        System.out.println("this is message method.");
    }
    
    
    void display(){
        
    //call message method
    message();
    System.out.println("this is display method.");
    
    }
    
    public static void main(String[] args) {
     PersonMethod p=new PersonMethod();
     p.display();
    }
    
}
