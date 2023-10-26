package stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Collection {
    private ArrayList<Person> people = new ArrayList<Person>(200);
    private int min; // the minimum age
    private int max; // the maximum age
    private int total;

    public Collection() {
    }

    public int fastMinAge(){
         min = people.get(0).getAge();

        for(int i = 1; i < people.size(); i++){

        if (min > people.get(i).getAge()){
            min = people.get(i).getAge();
        }
        }
         return min;
}

    public int fastMaxAge() {
        max = people.get(0).getAge();

        for(int i = 1; i < people.size(); i++){

            if (max < people.get(i).getAge()){
                max = people.get(i).getAge();
            }
        }
        return max;}
    public float fastAvgAge() {

        for (Person person : people) {
            total += person.getAge();
        }
        return (float)total / people.size();
    }
    public void writeToFile(String fileName){


        try {
            FileWriter myWriter = new FileWriter(fileName);
            StringBuffer val = new StringBuffer ("Minimum age: ");
            val.append(fastMinAge());
            val.append("\nMaximum age: ");
            val.append(fastMaxAge());
            val.append("\nAverage age: ");
            val.append(fastAvgAge());
            for (Person p : people){
                val.append("\n"+ p.toString());
            }
            myWriter.write(val.toString());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
    public void add(Person person) {
        people.add(person);
    }
    public Person searchPeople(int number){
        return people.get(number);
    }
    public void readFromFile(String fileName){
    try{
        FileReader filereader = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(filereader);


        String line = reader.readLine();
        while ((line != null)){

            String[] elements = line.split(";");
            String lastName = elements[0];
            String firstName = elements[1];
            int age = Integer.parseInt(elements[3].trim());
            Person p = new Person(firstName, lastName, age);
            add(p);
            line = reader.readLine();

        }
        reader.close();

    }catch(IOException e){
        e.printStackTrace();

    }

    }

    @Override
    public String toString() {
        return "Collection{" +
                "people=" + people +
                '}';
    }
}
