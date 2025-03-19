package main.java.com.prototype;

/**
 * @author Bruno Ramirez
 */
public interface Document extends Cloneable {
    Document clone();
    void printContent();
}
