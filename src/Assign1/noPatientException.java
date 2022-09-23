package Assign1;

public class noPatientException extends Exception{
    /**
     * instantiates the class
     * @param s message to be passed to in the event of the exception being thrown
     */
    public noPatientException(String s){
        super(s);
    }
}
