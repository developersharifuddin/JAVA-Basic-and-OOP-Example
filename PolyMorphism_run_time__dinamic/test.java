
package PolyMorphism_run_time__dinamic;
// ata method overriden ar nioum a hoi

public class test {
    
    public static void main(String[] args) {
        
        Person p=new Person();   
        p.display(); 
        
        
         p= new Teacher();    //super class ar refference variable
         p.display();         //person class ar obj. ke reffer korece
         
         p= new Student();      //super class ar refference variable
         p.display();           //student class ar obj. ke reffer korece
    }
}
