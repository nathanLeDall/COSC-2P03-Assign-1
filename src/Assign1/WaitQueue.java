package Assign1;

public class WaitQueue {

    //first person in the queue
    private Node startOfQueue;

    /**
     *
     *
     */
    public WaitQueue(){
        startOfQueue = null;
    }

    /**
     *
     * @param patient
     */
    public void insert(Patient patient){
        Node tmp = startOfQueue;
        while(true){
            if (startOfQueue==null){
                startOfQueue = new Node(patient);
                return;
            }
            if (startOfQueue.getNext()==null && startOfQueue.getPatient().getPriority()>patient.getPriority()){
                startOfQueue.setNext(new Node(patient,null,startOfQueue));
                return;
            }

            if (startOfQueue.getNext()==null && startOfQueue.getPatient().getPriority()<patient.getPriority()){
                startOfQueue.setPrev(new Node(patient,null,startOfQueue));
                startOfQueue = startOfQueue.getPrev();
                return;
            }

            if (startOfQueue.getNext()==null && startOfQueue.getPatient().getPriority()==patient.getPriority()){
                if (startOfQueue.getPatient().getTimeOfArrival()< patient.getTimeOfArrival()){
                    startOfQueue.setNext(new Node(patient,null,startOfQueue));
                    return;
                }
                if (startOfQueue.getPatient().getTimeOfArrival()> patient.getTimeOfArrival()){
                    Node tmp2 = new Node(patient,startOfQueue,null);
                    startOfQueue.setPrev(tmp2);
                    startOfQueue = tmp2;
                    return;
                }

            }

            if (tmp.getNext()==null && tmp.getPatient().getPriority()> patient.getPriority()){
                tmp.setNext(new Node(patient,null,tmp));
                return;
            }
            if (tmp.getNext()==null && tmp.getPatient().getPriority()< patient.getPriority()){
                Node tmp3 = new Node(patient,tmp,null);
                tmp.setPrev(tmp3);
                return;
            }
            if (tmp.getNext()==null && tmp.getPatient().getPriority()== patient.getPriority()){
                if (tmp.getPatient().getTimeOfArrival() < patient.getTimeOfArrival()){
                    Node tmp3 = new Node(patient,tmp,null);
                    tmp.setPrev(tmp3);
                    return;
                }
                if (tmp.getPatient().getTimeOfArrival() > patient.getTimeOfArrival()){
                    tmp.setNext(new Node(patient,null,tmp));
                    return;
                }

            }
            if (tmp.getPrev()==null && tmp.getPatient().getPriority()< patient.getPriority()){
                Node tmp3 = new Node(patient,tmp,null);
                tmp.setPrev(tmp3);
                startOfQueue = tmp3;
                return;
            }
            if (tmp.getPrev()!=null && tmp.getNext()!=null && tmp.getPatient().getPriority()< patient.getPriority()){
                Node tmp2 = tmp.getPrev();
                Node tmp3 = new Node(patient,tmp,null);
                tmp2.setNext(tmp3);
                tmp.setPrev(tmp3);
                return;
            }
            if (tmp.getPrev()!=null && tmp.getNext()!=null && tmp.getPatient().getPriority()> patient.getPriority()){
                Node tmp2 = tmp.getNext();
                Node tmp3 = new Node(patient,tmp.getNext(),tmp);
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
    public Patient removeMax() throws noPatientException {
        if (startOfQueue==null){
            throw new noPatientException("there are no patients in the queue");
        }
        Patient tmp = startOfQueue.getPatient();
        startOfQueue = startOfQueue.getNext();
        startOfQueue.setPrev(null);
        return tmp;
    }

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
