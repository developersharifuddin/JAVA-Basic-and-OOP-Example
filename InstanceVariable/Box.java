
package InstanceVariable;

public class Box {
  
    double height,width,depth;
    
    Box(double height,double width, double depth){
        this.height=height;
        this.width=width;
        this.depth=depth;
    
    }
    
    void display(){
          double vol= height*width*depth;
          System.out.println("the vol is "+vol);
    
    }
    
    public static void main(String[] args) {
        
        Box box1= new Box(10,10,20);
        Box box2= new Box(30,50,20);
        box1.display();
        box2.display();
        
    }
    
    
    
}
