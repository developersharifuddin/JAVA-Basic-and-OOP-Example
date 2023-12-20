
package Method_Of_Java_all;

public class ParamirerMethod {
    String name,gender;
    int roll;
    
    //paramiterize consctructor method
   void setInformation(String n,String g,int r){
       name=n;
       gender=g;
       roll=r;
   }
   
    void displayinformation(){
        System.out.println("name is "+name); 
        System.out.println("gender is "+gender); 
        System.out.println("roll is "+roll); 
        System.out.println(" ");
    }
     
}
