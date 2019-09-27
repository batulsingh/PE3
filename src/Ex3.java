import java.util.*;
import java.text.*;

public class Ex3 {

    public static void main(String []args){
        Calendar cdr = Calendar.getInstance(); // getInstance is used to get calendar using current time zone

        cdr.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY); // set monday of current week in calendar

        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        System.out.println(df.format(cdr.getTime()));
        for (int i = 0; i <6; i++) {
            cdr.add(Calendar.DATE, 1);
        }
        System.out.println(df.format(cdr.getTime()));
        System.out.println();
    }
}