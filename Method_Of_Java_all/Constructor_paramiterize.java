
package Method_Of_Java_all;

public class Constructor_paramiterize {
    
    
     public static void main(String[] args) {
        //auto call paramiterize consctructor method
       Constructor teacher1=new Constructor("anisul islam","male",1786267819); 
       teacher1.displayinformation();
       
       Constructor teacher2=new Constructor("shariful islam","male",1786267819); 
       teacher2.displayinformation();
       
       //auto call defult consctructor method
       Constructor teacher3=new Constructor(); 
       teacher3.displayinformation();
       
       
       
    }
    
    
    
}
