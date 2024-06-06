import javax.xml.bind.JAXBContext; // Import JAXBContext for managing XML binding
import javax.xml.bind.JAXBException; // Import JAXBException to handle exceptions related to JAXB operations
import javax.xml.bind.Unmarshaller; // Import Unmarshaller to convert XML back into Java objects
import java.io.File; // Import File for handling file operations

public class DeserializeObjectFromXML {
    public static void main(String[] args) {
        try {
            // Create a new JAXBContext instance for the Father class
            JAXBContext context = JAXBContext.newInstance(Father.class);

            // Create an Unmarshaller instance from the context
            Unmarshaller unmarshaller = context.createUnmarshaller();

            // Use the unmarshaller to convert XML content from a file into a Father instance
            Father obj = (Father) unmarshaller.unmarshal(new File("father.xml"));

            // Output that deserialization has been completed
            System.out.println("Object has been deserialized from father.xml");

            // Print the deserialized object
            System.out.println(obj);

            // Print the age of the child object, if it exists
            System.out.println(obj.child.age);

            // Print the name of the child of the child object, if it exists
            System.out.println(obj.child.childOfChild.name);

        } catch (JAXBException e) {
            // Handle any JAXB exceptions that occur during unmarshalling
            e.printStackTrace();
        }
    }
}
