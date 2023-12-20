
package Inheritence;

public class teacher extends person {
    
    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    
    void display(){
    
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getQualification());
        
    }
    
    
    
    public static void main(String[] args) {
        
        
        
        teacher t1=new teacher();
        t1.setName("sharif");
        t1.setAge(21);
        t1.setQualification("BSC in CSE");
        t1.display();
    }
    
    
    
}
