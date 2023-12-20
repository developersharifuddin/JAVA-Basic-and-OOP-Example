
package Static_Method;

public class StaticVariable2 {
 
   // static variable
    static int count =0;
     
  StaticVariable2(){
        count++;
     }
  void totalStudent(){
      System.out.println(count);
  }
    
    public static void main(String[] args) {  
        
        StaticVariable2 s1= new StaticVariable2();
        s1.totalStudent();
        
        StaticVariable2 s2= new StaticVariable2();
        s2.totalStudent();
        
        StaticVariable2 s3= new StaticVariable2();
        s3.totalStudent();
        
        StaticVariable2 s4= new StaticVariable2();
        s4.totalStudent();
       
    
    }
}
