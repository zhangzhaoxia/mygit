interface Animal {
    void shout ();
}
class Cat implements Animal {
    public void shout () {
   System.out.println("����......");
     }
     void sleep() {
   System.out.println("è˯��......");
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