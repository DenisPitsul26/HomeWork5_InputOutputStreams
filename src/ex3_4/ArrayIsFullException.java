package ex3_4;

public class ArrayIsFullException extends Exception {

    @Override
    public String getMessage() {
        return " This Array is already full ";
    }
}
