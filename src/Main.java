import com.Workintech.Person;
import com.Workintech.Wall;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Selahattin Tolga","Pekdemir",24,"Web Developer","Chess","Bachelor");
        Person person2 = new Person("Ahmet","Soyadı",14);
        System.out.println(person1.getAge());
        System.out.println(person1.getFirstName());
        System.out.println(person1.getLastName());
        System.out.println(person1.isTeen());
        System.out.println(person1.toString());

        System.out.println(person2.getAge());
        System.out.println(person2.getFirstName());
        System.out.println(person2.getLastName());
        System.out.println(person2.isTeen());
        System.out.println(person2.toString());

        Wall wall1 = new Wall(12.2,13.2);
        Wall wall2 = new Wall(-13,43);
        System.out.println(wall1.getArea());
        System.out.println(wall1.getHeight());
        System.out.println(wall1.getWidth());
        wall1.setHeight(233);
        wall1.setWidth(322.12);

        System.out.println(wall1.toString());

        System.out.println(wall2.getArea());
        System.out.println(wall2.getHeight());
        System.out.println(wall2.getWidth());
        wall2.setHeight(2122);
        wall2.setWidth(121222.12);
        System.out.println(wall2.toString());




    }
}