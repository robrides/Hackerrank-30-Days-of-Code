
package calendarpractice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// or import java.util.*;  increases size unnecessarily

public class CalendarPractice {


    
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 111); //0 is today, tomorrow is 1, etc.
        System.out.println(cal.getTime());
        SimpleDateFormat format1 = new SimpleDateFormat("yyy-MM-dd");
        String formatted = format1.format(cal.getTime());
        System.out.println(formatted);
    }
    
}
