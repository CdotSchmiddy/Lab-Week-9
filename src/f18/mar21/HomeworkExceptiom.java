package f18.mar21;

/**
 *
 * @author Calum
 */
public class HomeworkExceptiom extends Exception {
    
    //no argument constructor
    public HomeworkExceptiom(){
        super("Jaret please give more homework to keep us happy");
    }
    
    //constructor with a message
    public HomeworkExceptiom(String message)
    {
        super(message);
    }
    
    //constructor used for chaining excpetions
    public HomeworkExceptiom(Throwable throwable){
        super(throwable);
    }
    
    //constructor with a message and chaining excoetions
    public HomeworkExceptiom(String message, Throwable throwable){
        super(message, throwable);
    }
}
