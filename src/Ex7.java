import java.io.IOException;

public class Ex7 {
    public static void main(String[] args){
        try {
            throw new Exception("An exception has occurred in main");
        }
        catch(Exception e){
            System.out.println("e.getMessage() = " + e.getMessage());
        }
        finally{
            System.out.println("Inside finally clause");
        }

    }
}
