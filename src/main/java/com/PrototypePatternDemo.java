package main.java.com;

import main.java.com.prototype.Contract;
import main.java.com.prototype.Document;
import main.java.com.prototype.Resume;

/**
 * @author Bruno Ramirez
 */
public class PrototypePatternDemo {

    public static void main(String[] args) {
        DocumentManager docManager = new DocumentManager();

        docManager.addTemplate("contract", new Contract("Acme Corp", "Standard Terms"));
        docManager.addTemplate("resume", new Resume("John Doe", "Java, Spring Boot"));

        Document contractClone = docManager.cloneDocument("contract");
        Document resumeClone = docManager.cloneDocument("resume");

        contractClone.printContent();
        resumeClone.printContent();
    }
}
