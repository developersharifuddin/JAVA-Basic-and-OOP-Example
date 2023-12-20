
package Method_Of_Java_all;


public class Factorial {
    
    int fact(int n){
    if (n==1)
            return 1;
    else 
        return n*fact(n-1);
    }
    
    public static void main(String[] args) {
       Factorial ob= new Factorial();
       int result=ob.fact(5);
        System.out.println("factrual 5 is: "+result);
    }
    
}
    
