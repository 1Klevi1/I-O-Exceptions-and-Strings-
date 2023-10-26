import stream.Collection;
import stream.Person;

public class Main {
    public static void main(String[] args) {
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