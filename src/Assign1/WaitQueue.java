package Assign1;

public class WaitQueue {

    //first person in the queue
    private Node startOfQueue;

    /**
     *
     * @param patients
     */
    public WaitQueue(Patient[] patients){
        startOfQueue = null;
    }

    /**
     *
     * @param patient
     */
    public void insert(Patient patient){
        Node tmp = startOfQueue;
        while(tmp!=null){
            if (startOfQueue==null){
                startOfQueue = new Node(patient);
                return;
            }
            if (startOfQueue.getNext()==null && startOfQueue.getPatient().getPriority()>patient.getPriority()){
                startOfQueue.setNext(new Node(patient));
                return;
            }
            if (startOfQueue.getNext()==null && startOfQueue.getPatient().getPriority()<patient.getPriority()){
                startOfQueue.setPrev(new Node(patient));
                startOfQueue = startOfQueue.getPrev();
                return;
            }
            if (tmp.getNext()==null && tmp.getPatient().getPriority()> patient.getPriority()){
                tmp.setNext(new Node(patient));
                return;
            }
            if (tmp.getPatient().getPriority()< patient.getPriority()){
                Node tmp2 = tmp.getPrev();
                Node tmp3 = new Node(patient,tmp,null);
                tmp2.setNext(tmp3);
                tmp.setPrev(tmp3);
                return;
            }
            if (tmp.getPatient().getPriority()> patient.getPriority()){
                Node tmp2 = tmp.getNext();
                Node tmp3 = new Node(patient,null,tmp);
                tmp2.setPrev(tmp3);
                tmp.setNext(tmp3);
                return;
            }
            tmp = tmp.getNext();
        }
    }

    /**
     *
     * @return
     */
    public Patient removeMax(){
        return new Patient();
    }
}
