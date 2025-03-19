package main.java.com;

import main.java.com.prototype.Document;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Bruno Ramirez
 */
public class DocumentManager {
    private Map<String, Document> documentTemplates = new HashMap<>();

    public void addTemplate(String key, Document doc) {
        documentTemplates.put(key, doc);
    }

    public Document cloneDocument(String key) {
        return documentTemplates.get(key).clone();
    }
}