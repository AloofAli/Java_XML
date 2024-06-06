import javax.xml.bind.annotation.XmlElement; // Import XmlElement for specifying XML element names
import javax.xml.bind.annotation.XmlRootElement; // Import XmlRootElement for specifying the root element of the XML
import java.io.Serial; // Import Serial for the serialVersionUID annotation (Java 14+)
import java.io.Serializable; // Import Serializable for enabling object serialization

@XmlRootElement // This annotation indicates that this class can be the root element of an XML document
public class Father implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L; // Unique identifier for serialization

    private String name; // Name field to be serialized and deserialized
    private int age; // Age field to be serialized and deserialized

    public Child child = new Child(); // Child object to be serialized and deserialized

    // Default no-argument constructor
    public Father() {}

    // Constructor to initialize Father with name and age
    public Father(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @XmlElement // This annotation specifies that the name field should be represented as an XML element
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement // This annotation specifies that the age field should be represented as an XML element
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Father{name='" + name + "', age=" + age + '}'; // Override toString() to provide a string representation of Father
    }
}
