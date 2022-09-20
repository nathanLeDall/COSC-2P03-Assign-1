package Assign1;

public class Node {
    private Patient patient;//patient stored in node
    private Node next;//next node
    private Node prev;//prev node

    /**
     * constructor initializes all the varibales based on provided inputs
     * @param patient the patient to store
     * @param next the next node in the queue
     * @param prev the prev node in the queue
     */
    public Node (Patient patient, Node next, Node prev){
        this.patient = patient;
        this.next = next;
        this.prev = prev;
    }

    /**
     * construcor initializes variables patient based on provided data and sets prev and next to null
     * @param patient the patient to store in that node
     */
    public Node (Patient patient){
        this.patient = patient;
        next = null;
        prev = null;
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
