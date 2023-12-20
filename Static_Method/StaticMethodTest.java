
package Static_Method;

class StaticMethodTest {
    
    public static void main(String[] args) {
         StaticMethod ob1= new StaticMethod();
         ob1.Display1(); //call  non Static Method
         
          //auto call  Static Method
          StaticMethod.Display2();
          
    }
}
