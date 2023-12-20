
package Inheritence;


   
public class singleInheritQ extends singleInheritP{
    String qualy="CSE";

    void display2(){
    display1();
        System.out.println(qualy);
       
    }
    
     public static void main(String[] args) {
    singleInheritQ ob=new singleInheritQ();
    ob.setAge(20);
    ob.setName("sharif");
    
    ob.display2();
    
    }

    
}
