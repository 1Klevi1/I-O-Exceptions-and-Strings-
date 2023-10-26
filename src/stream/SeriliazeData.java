package stream;
import java.io.Serializable;
import java.util.List;
public class SeriliazeData {


    public class SerializedData implements Serializable {
        private int minimumAge;
        private int maximumAge;
        private double averageAge;
        private List<Person> people;

        // Constructors, getters, and setters for the fields

        // Constructor
        public SerializedData(int minimumAge, int maximumAge, double averageAge, List<Person> people) {
            this.minimumAge = minimumAge;
            this.maximumAge = maximumAge;
            this.averageAge = averageAge;
            this.people = people;
        }

        // Getter and setter methods for the fields

        // Example getter:
        public int getMinimumAge() {
            return minimumAge;
        }

        // Repeat for the other fields
    }

}
