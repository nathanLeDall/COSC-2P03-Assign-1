package Assign1;

public class Node {
    private Patient patient;//patient stored in node
    private Node next;//next node
    private Node prev;//prev node

    /**
     * constructor initializes all the variables based on provided inputs
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
     * constructor initializes variables patient based on provided data and sets prev and next to null
     * @param patient the patient to store in that node
     */
    public Node (Patient patient){
        this.patient = patient;
        next = null;
        prev = null;
    }

    /**
     * returns the stored patient
     * @return Patient the patient
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * sets the current patient
     * @param patient the patient to be stored
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    /**
     * get the next node
     * @return Node the next node
     */
    public Node getNext() {
        return next;
    }

    /**
     * set the next node
     * @param next the next node
     */
    public void setNext(Node next) {
        this.next = next;
    }

    /**
     * get the previous node
     * @return Node the previous node
     */
    public Node getPrev() {
        return prev;
    }

    /**
     * set the previous node
     * @param prev the previous node
     */
    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
