import stream.Collection;
import stream.Person;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("jonh","smith",55);
        Person p1 = new Person("jonh1","smith",55);
        Person p2 = new Person("jonh2","smith",55);
//        System.out.println(p);
//        System.out.println(p1);
//        System.out.println(p2);
        Collection c = new Collection();
        c.readFromFile("people-2.txt");
//        System.out.println(c.searchPeople(4));
//        System.out.println(c.fastMinAge());
//        System.out.println(c.fastMaxAge());
//        System.out.println(c.fastAvgAge());
        c.writeToFile("peopleWritten.txt");
        c.writeObjects("testing.txt");
    }




}