
package Final_keyword;


public class University {
   final String University_name="DUET";
   final int fees;
   static final String exmDate;
   
   University() {  //constructor 
    fees = 3500;
   }
    static{   //static block
    exmDate="25 januarary, 2022";
    }
    
    void display(){
        System.out.println("University_name is "+University_name);
        System.out.println("fees "+fees);
        System.out.println("exmDate "+exmDate);
    }
    
    public static void main(String[] args) {
        University ob= new University();
        ob.display();
    }
}
