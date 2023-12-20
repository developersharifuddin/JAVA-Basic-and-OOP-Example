
package MethodOverriding;

 public class overrideTeacher extends OverridPerson {
    
    String qualifications;
    
    
    
    @Override
      
    void display(){
        System.out.println("name is "+name);
        System.out.println("age is "+age);
        System.out.println("qualifications is "+qualifications);
        System.out.println("");
    }
    
    
    
    public static void main(String[] args) {
      overrideTeacher t1=new overrideTeacher();
      t1.name="sharif";
      t1.age=20;
      t1.qualifications="BSC IN CSE";
      t1.display();
     
      
      OverridPerson p1=new OverridPerson();
      p1.name="karim";
      p1.age=22;
      p1.display();
     
      
    }
}
