package Assign1;

public class WaitQueue {

    //first person in the queue
    private Node startOfQueue;

    /**
     * constructor initializes the start of queue vairable to be null
     */
    public WaitQueue(){
        startOfQueue = null;
    }

    /**
     * insert a patient into the queue
     * @param patient the patient to be inserted
     */
    public void insert(Patient patient){
        Node tmp = startOfQueue;
        while(true) {
            //all of these conditional statements only run if the patient should be inserted into the slot that the conditional inserts into
            if(tmp==startOfQueue) {//only runs when comparing the first and second patients in the queue
                if (startOfQueue == null) {//inserts the patient as the first node if the queue is empty
                    startOfQueue = new Node(patient);
                    return;
                }
                if (startOfQueue.getNext() == null && startOfQueue.getPatient().getPriority() > patient.getPriority()) {//inserts the patient at the end of the queue if there is only one patient in the queue
                    startOfQueue.setNext(new Node(patient, null, startOfQueue));
                    return;
                }

                if (startOfQueue.getNext() == null && startOfQueue.getPatient().getPriority() < patient.getPriority()) {//inserts the patient at the beginning of the list if there is only one patient in the queue
                    startOfQueue.setPrev(new Node(patient, startOfQueue, null));
                    startOfQueue = startOfQueue.getPrev();
                    return;
                }

                if (startOfQueue.getNext() == null && startOfQueue.getPatient().getPriority() == patient.getPriority()) {//tie braker if the patients have the same priority
                    if (startOfQueue.getPatient().getTimeOfArrival() < patient.getTimeOfArrival()) {//inserts the patient at the end of the queue if there is only one patient in the queue
                        startOfQueue.setNext(new Node(patient, null, startOfQueue));
                        return;
                    }
                    if (startOfQueue.getPatient().getTimeOfArrival() > patient.getTimeOfArrival()) {//inserts the patient at the beginning of the queue if there is only one patient in the queue
                        startOfQueue.setPrev(new Node(patient, startOfQueue, null));
                        startOfQueue = startOfQueue.getPrev();
                        return;
                    }

                }
            }
            if (tmp.getNext()==null && tmp.getPatient().getPriority()> patient.getPriority()){ //inserts the patient as the last element of the list
                tmp.setNext(new Node(patient,null,tmp));
                return;
            }
            if (tmp.getNext()==null && tmp.getPatient().getPriority()< patient.getPriority()){ //inserts the patient as the second last element of the list
                tmp.setPrev(new Node(patient,tmp,null));
                return;
            }
            if (tmp.getNext()==null && tmp.getPatient().getPriority()== patient.getPriority()){ //tie brake if the patients have the same priority
                if (tmp.getPatient().getTimeOfArrival() < patient.getTimeOfArrival()){ //inserts the patient as the last element of the list
                    tmp.setNext(new Node(patient,null,tmp));
                    return;
                }
                if (tmp.getPatient().getTimeOfArrival() > patient.getTimeOfArrival()){ //inserts the patient as the second last element of the list
                    tmp.setNext(new Node(patient,null,tmp));
                    return;
                }

            }
            if (tmp.getPrev()==null && tmp.getPatient().getPriority()< patient.getPriority()){// inserts the patient at the begining of the queue
                tmp.setPrev(new Node(patient,tmp,null));
                startOfQueue = tmp.getPrev();
                return;
            }
            if (tmp.getPrev()!=null && tmp.getNext()!=null && tmp.getPatient().getPriority()< patient.getPriority() ){//inserts the patient to the left of the one in tmp
                Node tmp2 = tmp.getPrev();
                Node tmp3 = new Node(patient,tmp,null);
                tmp2.setNext(tmp3);
                tmp.setPrev(tmp3);
                return;
            }
            if (tmp.getPrev()!=null && tmp.getNext()!=null && tmp.getPatient().getPriority()> patient.getPriority()){//inserts the patient to the right of the one in tmp
                Node tmp2 = tmp.getNext();
                Node tmp3 = new Node(patient,tmp.getNext(),tmp);
                tmp2.setPrev(tmp3);
                tmp.setNext(tmp3);
                return;
            }
            if (tmp.getPatient().getTimeOfArrival()== patient.getTimeOfArrival()){//tie brake if the patients have the same priority
                if (tmp.getPrev()!=null && tmp.getNext()!=null && tmp.getPatient().getTimeOfArrival()< patient.getTimeOfArrival()){//inserts the patient to the left of the one in tmp
                    Node tmp2 = tmp.getPrev();
                    Node tmp3 = new Node(patient,tmp,null);
                    tmp2.setNext(tmp3);
                    tmp.setPrev(tmp3);
                    return;
                }
                if (tmp.getPrev()!=null && tmp.getNext()!=null && tmp.getPatient().getTimeOfArrival()> patient.getTimeOfArrival()){//inserts the patient to the right of th one in tmp
                    Node tmp2 = tmp.getNext();
                    Node tmp3 = new Node(patient,tmp.getNext(),tmp);
                    tmp2.setPrev(tmp3);
                    tmp.setNext(tmp3);
                    return;
                }
            }
            tmp = tmp.getNext();
        }
    }

    /**
     *
     * @return returns the patient removed from the queue
     */
    public Patient removeMax() throws noPatientException {
        if (startOfQueue==null){
            throw new noPatientException("there are no patients in the queue");
        }
        if (startOfQueue.getNext()==null){
            Node tmp = startOfQueue;
            startOfQueue = null;
            return tmp.getPatient();
        }
        Patient tmp = startOfQueue.getPatient();
        startOfQueue = startOfQueue.getNext();
        startOfQueue.setPrev(null);
        return tmp;
    }

    /**
     * returns all the variables and all the patients in the queue in order
     * @return a String of all the variables and all the patients in the queue in order
     */
    @Override
    public String toString() {
        StringBuilder tmp = new StringBuilder();
        Node tmp3 = startOfQueue;
        int count = 0;
        while(tmp3!=null){
            tmp.append(tmp3.getPatient().toString());
            tmp.append("\n");
            tmp3 = tmp3.getNext();
            count++;
        }
        return "WaitQueue{" +
                "startOfQueue=" + startOfQueue +
                ", current queue=\n"+ tmp + "\n"+
                " counter="+count+
                '}';
    }
}
