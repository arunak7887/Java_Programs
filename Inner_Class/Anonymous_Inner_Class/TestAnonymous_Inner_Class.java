package Inner_Class.Anonymous_Inner_Class;
abstract class Person {
    abstract void eat();
}
public class TestAnonymous_Inner_Class {

    public static void main(String[] args) {
        Person p=new Person() {
            void eat(){
                System.out.println("Nice Fruits");
            }
            
        };
        p.eat();
        
    }
    
}
