
package super_Keyword_And_Method;

// super key, contructor,overrider method
public class Vehical {
    
    String color;
    double width;
    
    //contructor
    Vehical(String c, double w){
    color = c;
    width = w;
    
    }
    
    void display(){
        System.out.println(color);
        System.out.println(width);
    }
}
