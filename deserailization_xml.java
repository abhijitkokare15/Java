import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

// XMLDecoder asks the JVM (through reflection) to create a new object. The JVM:

// Allocates heap memory.
// Calls the no-argument constructor.
// Returns the reference to XMLDecoder.

//So even though you never write new Student(), XMLDecoder internally requests the JVM to create a new Student object using reflection. That's how the object gets created and memory is allocated.
public class deserailization_xml {
    public static void main() throws Exception 
    {
        XMLDecoder xd = new XMLDecoder(new BufferedInputStream(new FileInputStream("efgh.xml") ));
        Serailization_xml xe = (Serailization_xml) xd.readObject();
           System.out.println(xe);
        System.out.println(xe.rollno);
            
        }
    }

