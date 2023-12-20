
package Polymorphism_method_dispus;

public class Test {
    
    public static void main(String[] args) {
        
        
        Shape[] s = new Shape[3];
        s[0] = new Shape();
        s[1] = new Rectangle(10,20);
        s[2] = new Triangle(20,30);
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Area is : "+ s[i].area());
            
        }
        
        
    }
    
}
