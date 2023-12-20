
package Method_Of_Java_all;

public class ReturningValue {
    int Square(int value){
    return value*value;    
    }

 public static void main(String[] args) {
     ReturningValue ob1=new ReturningValue();
     int value1=ob1.Square(5);
     System.out.println("the value 5 is: "+value1);
     
     int value2=ob1.Square(25);
     System.out.println("the value 25 is: "+value2);
}
}