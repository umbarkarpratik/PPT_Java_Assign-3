package PrePlacementTraning.JavapptAssign3;
//Q2. Write a Program where you inherit method from parent class and 
//    show method Overridden Concept?

public class Que2 {
    
    public static void main(String[] args) {
        Parent p=new Parent();
        Child c=new Child();

        p.method();
        c.method();
    }
}
class Parent{
   public void method(){
        System.out.println("parent class");
   }
}
class Child extends Parent
{
    @Override
    public void method(){
        System.out.println("child class");
    }
}
