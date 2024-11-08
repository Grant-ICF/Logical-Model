import java.io.File;
import java.io.FileOutputStream;
import org.srdc.ontmalizer.XSD2OWLMapper;

/* public class HMISLogicalModel2024Test {
    public static void main(String[] args) {
        try {
            // Convert XML schema to OWL ontology
            XSD2OWLMapper mapping = new XSD2OWLMapper(new File("C:/Users/61084/Desktop/NHDAP Data Lab/ICF Data Lab/Logical-Model/XML Files/HUD_HMIS.xsd"));
            mapping.setObjectPropPrefix("");
            mapping.setDataTypePropPrefix("");
            mapping.convertXSD2OWL();

            // Print the ontology to a file
            FileOutputStream ont = new FileOutputStream(new File("C:/Users/61084/Desktop/NHDAP Data Lab/ICF Data Lab/Logical-Model/Outputs/OWL/001_FY24HMISontology.owl"));
            mapping.writeOntology(ont, "RDF/XML");
            ont.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
} */

import java.io.File;
import org.srdc.ontmalizer.XSD2OWLMapper;

public class HMISLogicalModel2024Test {
    public static void main(String[] args) {
        try {
            // Convert XML schema to OWL ontology
            XSD2OWLMapper mapping = new XSD2OWLMapper(new File("C:\\Users\\61084\\Desktop\\NHDAP Data Lab\\ICF Data Lab\\Logical-Model\\XML Files\\HUD_HMIS.xsd"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}