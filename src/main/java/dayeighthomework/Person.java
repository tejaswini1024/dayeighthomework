package dayeighthomework;

public abstract class Person {
    private String personName;

    public Person(){// default constructor

    }
    public Person(String name) {
        this.personName = name;
    }

    // Getter and Setter methods for Person
    public String getName() {
        return personName;
    }

    public void setName(String name) {
        this.personName = name;
    }
}

