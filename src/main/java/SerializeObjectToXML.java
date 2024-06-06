import javax.xml.bind.JAXBContext; // Import JAXBContext for managing XML binding
import javax.xml.bind.JAXBException; // Import JAXBException to handle exceptions related to JAXB operations
import javax.xml.bind.Marshaller; // Import Marshaller to convert Java objects to XML
import java.io.File; // Import File for handling file operations

public class SerializeObjectToXML {
    public static void main(String[] args) {
        
        Father obj = new Father("Ali Alavi", 30);

        try {
            // Create a new JAXBContext instance for the Father class
            JAXBContext context = JAXBContext.newInstance(Father.class);

            // Create a Marshaller instance from the context
            Marshaller marshaller = context.createMarshaller();

            // Set the Marshaller property to format the XML output with indentation
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            // Use the Marshaller to convert the obj instance to XML and write it to a file named "father.xml"
            marshaller.marshal(obj, new File("father.xml"));

            // Output that serialization has been completed
            System.out.println("Object has been serialized to father.xml");
        } catch (JAXBException e) {
            // Handle any JAXB exceptions that occur during marshalling
            e.printStackTrace();
        }
    }
}
