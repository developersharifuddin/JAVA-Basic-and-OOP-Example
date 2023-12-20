
package super_Keyword_And_Method;

public class qmethod extends pMethod  {
    
    @Override         //override method and sub class
    void display(){
    
        System.out.println("this is sub class method/// inside b class ");
        super.display();
    }
    
    public static void main(String[] args) {
        qmethod b = new qmethod();
        b.display();
    }
    
    
    
}
