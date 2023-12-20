
package super_Keyword_And_Method;

public class VCar extends Vehical {
    int gear;
    
    
    VCar(String c, double w, int g){
    
    super(c,w);
    gear=g;
    }
    
    @Override
    void display(){
       super.display();
        System.out.println(gear);
    }
    
    
    
    
    public static void main(String[] args) {
        VCar c20=new VCar("black",500,5);
        c20.display();
        
    }
    
}
