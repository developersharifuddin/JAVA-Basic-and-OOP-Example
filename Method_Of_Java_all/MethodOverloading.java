
package Method_Of_Java_all;

public class MethodOverloading {
    
    //Method Overloading
    void add(int a, int b){
        System.out.println("int a+b is: "+ (a+b));
    }
    
    void add(double a, double b){
        System.out.println("double a+b is: "+ (a+b));
    }
    
    void add(int a, int b, int c){
        System.out.println("int a+b+c is: "+ (a+b+c));
    }
    
    void add(String a, String b){
        System.out.println("string a+b is: "+ (a+b));
    }
    
    void add(){
        System.out.println("this method No add peramiter");
    }
    
    public static void main(String[] args) {
        MethodOverloading ob= new MethodOverloading();
        ob.add();
        ob.add(20,30);
        ob.add(20.5,30.5);
        ob.add(20,30,40);
        ob.add("sharif ","uddin");
        
        
        
        
    }
    
    
    
    
    
}
