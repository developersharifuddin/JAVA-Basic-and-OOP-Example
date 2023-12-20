package thisKeyword;
//Person Call to Instant Variable

public class Person {
   String name;
   int age;
   String haircolor;
  Person(String name, int age){
      //call instant variavle
        this.name=name;
        this.age=age;
  } 
   
  Person(String name, int age, String haircolor){
        this(name,age); //call to constructor current class
        this.haircolor = haircolor;
  } 
   
   
   void display(){
       System.out.println("name is "+name);
       System.out.println("age is "+age);
       System.out.println("haircolor is "+haircolor);
       System.out.println("");
   }
   
   
    public static void main(String[] args) {
      Person p1=new Person("sharif",21);  
      p1.display();
      Person p2=new Person("shariful",18,"gold");
      p2.display();
    }
   
   
   

}
