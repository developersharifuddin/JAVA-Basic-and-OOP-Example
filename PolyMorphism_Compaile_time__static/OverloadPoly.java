
package PolyMorphism_Compaile_time__static;
// ata method overload ar nioum a hoi

public class OverloadPoly {
    
      void add(int a, int b){
      System.out.println(a+b);
      }
    
    void add(double a, double b){
        System.out.println(a+b);
    }
    
    void add(String a, String b){
        System.out.println(a+b);
    }
    
    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    
    void add(){
        System.out.println("no peramiter add. ");
    }
    
    public static void main(String[] args) {
        
        OverloadPoly ob=new OverloadPoly();
        ob.add();
        ob.add(20,30);
        ob.add(20,30,50);
        ob.add(20.5, 30.6);
        ob.add("sharif ","uddin");
        
        
    } 
}
