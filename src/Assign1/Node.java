package Assign1;

public class Node {
    private Patient patient;
    private Node next;
    private Node prev;

    public Node (Patient patient, Node next, Node prev){
        this.patient = patient;
        this.next = next;
        this.prev = prev;
    }
    public Node (Patient patient){
        this.patient = patient;
        next = null;
        prev = null;
    }
    public Node(){

    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
