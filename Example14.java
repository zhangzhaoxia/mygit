interface Animal {
    void shout ();
}
class Cat implements Animal {
    public void shout () {
   System.out.println("ίχίχ......");
     }
     void sleep() {
   System.out.println("Γ¨Λ―Ύυ......");
    }
}
public class Example14 {
    public static void main (String[] args) {
     Cat cat=new Cat();
      animalShout(cat);
}
public static void animalShout(Animal animal) {
    animal.shout();
    animal.sleep();
    }
}