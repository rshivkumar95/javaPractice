package abc;

public class InvalidBookException extends Exception{

    public InvalidBookException(String msg)
    {
        super(msg);
    }
    public InvalidBookException(Throwable t)
    {
        super(t);
    }
    //Student code here

}