//consctructor method
package Method_Of_Java_all;

public class Constructor {
    
    String name,gender;
    int roll;
    
    //paramiterize consctructor method
   Constructor(String n,String g,int r){
       name=n;
       gender=g;
       roll=r;
   }
   //defult consctructor method
   Constructor(){
       System.out.println("manage by sharif uddin");
   }
   
    void displayinformation(){
        System.out.println("name is "+name); 
        System.out.println("gender is "+gender); 
        System.out.println("roll is "+roll); 
        System.out.println(" ");
    }
    
}
