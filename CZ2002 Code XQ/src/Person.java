import java.io.Serializable;

/**
 * Entity Class for Person
 */
public class Person implements Serializable {

    /**
     * Student's ID
     */
    protected int Id;

    /**
     * Student's first and last name
     */
    protected String Name;

    /**
     * Constructor to assign values to Id and Name
     * @param id
     * @param name
     */
    public Person(int id, String name) {
        Name = name;
        Id = id;
    }

    /**
     * Getter for Name
     * @return
     */
    public String getName() {
        return Name;
    }

    /**
     * Setter for Name
     * @param name
     */
    public void setName(String name) {
        Name = name;
    }

    /**
     * Getter for Id
     * @return
     */
    public int getId() {
        return Id;
    }

    /**
     * Setter for Id
     * @param id
     */
    public void Id(int id) {
        Id = id;
    }

}
