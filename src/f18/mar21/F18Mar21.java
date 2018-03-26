package f18.mar21;

/**
 *
 * @author Calum
 */
public class F18Mar21 {

    public static void main(String[] args) {
        firstMethod();
        Thread.dumpStack();
    }
    
    public static void firstMethod(){
        secondMethod();
        Thread.dumpStack();
    }
    
    public static void secondMethod(){
        Thread.dumpStack();
    }
}
