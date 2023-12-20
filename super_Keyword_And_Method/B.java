
package super_Keyword_And_Method;

//sub class
public class B extends A{
    
    //sub class value
    int x=10;
    
   
    void display(){
        
        System.out.println("sub class value is "+x);
        //call super class value super.x
        System.out.println("super class value is: "+super.x);
        
    }
    
    
    public static void main(String[] args) {
        B ob=new B();
        ob.display();
    }
    
}
